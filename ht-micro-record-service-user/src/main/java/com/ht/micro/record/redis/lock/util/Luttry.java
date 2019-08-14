package com.ht.micro.record.redis.lock.util;

import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import redis.clients.jedis.JedisCluster;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

 /**
  * @Description 随机获取固定数，并满足比重
  * @Author wen88feng@126.com
  * @Date 2019/5/9 13:54
  **/
@Slf4j
@Component
public class Luttry {

    // 根据权重，初始化一个数组
    String[] amount= {"8","8","8","8","8","8","8","8","18","18","18","18","18","18","18","28","28","28","28","88"};
    // 每个数据出现的比重
    String[] weight= {"0.4","0.35","0.2","0.05"};

    static Map<String, String> map = new HashMap<>();

    static {
        map.put("8", "0.4");
        map.put("18", "0.35");
        map.put("28", "0.2");
        map.put("88", "0.05");
    }

    @Autowired
    private JedisCluster jedisCluster;


    @Synchronized
    public String lut() {
        String responde="";
        int randomNumber = ran(amount.length);// 随机数
        String val = jedisCluster.get(amount[randomNumber]);// 随机金额获取的次数
        String count = jedisCluster.get("count");// 从redis中取出总数
        if (StringUtils.isEmpty(count)) {
            jedisCluster.set("count", "0");
        }
        if (StringUtils.isEmpty(val)) {
            jedisCluster.set(amount[randomNumber],"1");
            count = jedisCluster.get("count");
            jedisCluster.set("count", String.valueOf(Integer.valueOf(count)+1));
            responde = amount[randomNumber];
        } else {
            count = jedisCluster.get("count");// 从redis取出发红包的总数
            double yu = Double.valueOf(val)/Double.valueOf(count);// 已经发出去的红包比重
            responde = calo(randomNumber,yu,val,count);
        }
        return responde;
    }

    public int ran(int size){
        Random random = new Random();
        int randomNumber = random.nextInt(size);
        return randomNumber;
    }

     /**
      * @Description
      * @Param randomNumber 随机数
      * @param yu  已经发出去的红包比重
      * @param val 随机金额次数
      * @param count 当前总次数
      * @Return 随机红包金额
      * @Author wen88feng@126.com
      * @Date 2019/5/9 13:54
      **/
    public String calo(int randomNumber,double yu,String val,String count) {
        String res ="";
        String amt = amount[randomNumber];
        String weightVal = map.get(amount[randomNumber]);
        if (Double.valueOf(map.get(amount[randomNumber])) > yu) {
            jedisCluster.set(amount[randomNumber], String.valueOf(Integer.valueOf(val)+1));
            jedisCluster.set("count", String.valueOf(Integer.valueOf(count)+1));
            res = amount[randomNumber];
        }else {// 当前金额的比重已经达到
            boolean flag = false;
            for (int i = 0;i< amount.length;i++) {
                String nowAmt = amount[i];

                if (nowAmt.endsWith(amt)) {
                    // 如果取的是当前金额，终止下面流程
                    continue;
                }
                // 检查当前的金额是否达到比重值
                double nowWeight = Double.valueOf(map.get(amount[i]));
                String nowVal = jedisCluster.get(nowAmt);// 当前金额随机次数
                String nowCount = jedisCluster.get("count");// 从redis中取出当前总数

                double nowYu = Double.valueOf(nowVal)/Double.valueOf(nowCount);// 已经发出去的红包比重
                // 如果当前金额的权重已经达标
                if (nowYu > nowWeight) {
                    continue;
                } else {
                    flag = true;
                    jedisCluster.set(nowAmt, String.valueOf(Integer.valueOf(nowVal)+1));
                    jedisCluster.set("count", String.valueOf(Integer.valueOf(nowCount)+1));
                    return nowAmt;
                }
            }
            // 如果都达标，则取出当前的这个随机金额，后续就会打破比重，进入新一轮的比重取值
            if (!flag) {
                jedisCluster.set(amount[randomNumber], String.valueOf(Integer.valueOf(val)+1));
                jedisCluster.set("count", String.valueOf(Integer.valueOf(count)+1));
                res = amount[randomNumber];
            }
        }
        return res;
    }

}
