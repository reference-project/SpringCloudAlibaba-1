package com.ht.micro.record.redis.lock.dLock;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import redis.clients.jedis.JedisCluster;

/**
 * @Description redis分布式锁实现
 * @className RedisDistributedLockImpl
 * @Author onejane
 * @Date 2019/4/29 11:36
 * @Version 1.0
 **/
@Slf4j
@Service
public class RedisDistributedLockImpl implements RedisDistributedLock {

    protected static final String OK = "OK";

    protected static final String NX = "NX";

    protected static final String EX = "EX";

    @Autowired
    private JedisCluster jedisCluster;

    @Override
    public boolean tryLock(String key, long leaseTime) {
        if (StringUtils.isEmpty(key)) {
            return false;
        }
        if (0 == leaseTime) {
            leaseTime = 10;
        }
        String lockResult = this.jedisCluster.set(key, String.valueOf(leaseTime),NX,EX,leaseTime);
        log.info("锁key：{}获取锁返回结果：{}",key,lockResult);
        if (OK.equalsIgnoreCase(lockResult)) {

            return true;
        }
        return false;
    }

    @Override
    public void release(String key, long leaseTime) {
        String currentValue = this.jedisCluster.get(key);
        if (!StringUtils.isEmpty(currentValue) && currentValue.equals(String.valueOf(leaseTime))) {
            log.info("开始释放锁："+key);
            this.jedisCluster.del(key);
        }

    }
}
