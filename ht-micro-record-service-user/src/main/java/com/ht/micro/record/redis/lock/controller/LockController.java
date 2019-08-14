package com.ht.micro.record.redis.lock.controller;

import com.ht.micro.record.redis.lock.dLock.RedisDistributedLock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LockController {

    @Autowired
    private RedisDistributedLock redisLock;

    private static final int TIMEOUT = 10; //超时时间 10s
    //库存
    //private AtomicInteger count = new AtomicInteger(100);
    private int count =3;
    //抢购成功数
    private int success=0;

    @RequestMapping("/testLock")
    public String testLock() {

        //加锁
        boolean islock = redisLock.tryLock("key", TIMEOUT);
        //没有获取到锁
        if (!islock){
            log.info("服务器忙，请重试");
            return "服务器忙，请重试";

        }
        //获取锁之后
        if (count==0){
            redisLock.release("key", TIMEOUT);
            log.info("抢完了,成功数为：{}",success);
            return "抢完了";
        }
        //因为获取到的锁的线程只有一个，所以这里计数也不会出错
        //库存减去1
        count--;
   /*     if (count.get()==0){
            redisLock.unlock("key",String.valueOf(time));
            log.info("抢完了,成功数为：{}",success);
            return "抢完了";
        }
        count.getAndDecrement();*/

        //解锁
        redisLock.release("key", TIMEOUT);
        success++;
        log.info("抢购成功 成功数为：{} 库存剩余为：{}",success,count);
        return "抢购成功";

    }


}