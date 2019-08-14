package com.ht.micro.record.redis.lock.config;

import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @Description RedissonClient 方式连接
 * @className RedissonManager
 * @Author onejane
 * @Date 2019/3/11 19:29
 * @Version 1.0
 **/
@Configuration
@Slf4j
public class RedissonManager {
    @Value("${spring.redis.cluster.nodes}")
    private  String cluster;

    @Bean
    public RedissonClient redissonClient(){
        if (null == cluster) {
            throw new RuntimeException("获取redis IP异常");
        }
        String [] nodes = cluster.split(",");
        for(int i=0;i<nodes.length;i++){
            nodes[i] = "redis://"+nodes[i];
        }
        RedissonClient redisson = null;

        Config config = new Config();

        config.useClusterServers() //这是用的集群server
        .setScanInterval(2000)
        .addNodeAddress(nodes);
        redisson = Redisson.create(config);
        try {
            log.info("redis连接：{}",redisson.getConfig().toJSON().toString());
        } catch (IOException e) {
            log.error("Redisson.getConfig异常");
        }
        return redisson;
    }
}
