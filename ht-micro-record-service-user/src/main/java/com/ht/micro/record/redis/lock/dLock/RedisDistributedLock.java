package com.ht.micro.record.redis.lock.dLock;

/**
 * @Description redis分布式锁
 * @className RedisDistributedLock
 * @Author onejane
 * @Date 2019/4/29 11:29
 * @Version 1.0
 **/
public interface RedisDistributedLock {

     /**
      * @Description 分布式上锁
      * @Param key 锁key键
      * leaseTime 单位秒，默认10秒上锁时间（当上锁时间结束，自动释放锁；当上锁时间还没结束，调用释放锁方法之后，也会释放锁）
      * @Return true获取锁成功，false没获取到锁
      * @Author onejane
      * @Date 2019/4/29 11:31
      **/
    boolean tryLock(String key, long leaseTime);

     /**
      * @Description 释放锁
      * @Param key 锁key键
      * @Return
      * @Author onejane
      * @Date 2019/4/29 11:34
      **/
    void release(String key, long leaseTime);
}
