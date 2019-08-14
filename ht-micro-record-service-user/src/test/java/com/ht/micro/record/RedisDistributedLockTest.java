package com.ht.micro.record;

import com.ht.micro.record.redis.lock.dLock.RedisDistributedLock;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.JedisCluster;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Description redis分布式锁单元测试
 * @className RedisDistributedLockTest
 * @Author onejane
 * @Date 2019/4/29 11:55
 * @Version 1.0
 **/
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { UserServiceApplication.class })
public class RedisDistributedLockTest {

    // 总请求量
    private static final int requestTotal = 1000;

    // 最大并发线程数20
    private static final int concurrentThreadNum = 5;

    @Autowired
    private RedisDistributedLock redisDistributedLock;

    @Autowired
    private JedisCluster jedisCluster;

    @Test
    public void TestLock() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(requestTotal);
        //new Semaphore(6) 表示初始化了 6个通路
        Semaphore semaphore = new Semaphore(concurrentThreadNum);
        long start = System.currentTimeMillis();
        for (int i = 0;i<requestTotal;i++) {
            int num = i;
            executorService.execute(()->{
                try {
                    // semaphore.acquire(2) 表示每次线程进入将会占用2个通路，
                    // semaphore.release(2) 运行时表示归还2个通路。没有通路，则线程就无法进入代码块。
                    semaphore.acquire();
                    unitTestLock(num);
                    semaphore.release();
                } catch (Exception e) {
                    log.error("exception",e);
                }
                countDownLatch.countDown();
            });
        }
        log.info("耗时：{}",System.currentTimeMillis()-start);
    }

    private void unitTestLock(int num) {
        String key = "0000000000000001";
        boolean lock = this.redisDistributedLock.tryLock(key,1);
    }

    @Test
    public void TestSet() {
        Long vl = this.jedisCluster.setnx("key001","13131231231231");
        log.info("setNx:{}",vl);
    }

    @Test
    public void Testexpire() {
        long vl = this.jedisCluster.expire("key001",10);
    }

    @Test
    public void TestSetTime() {
        this.jedisCluster.setex("key001",10,"131231231231");
    }

    @Test
    public void TestGet() {
        log.info(this.jedisCluster.get("key001"));
    }
}
