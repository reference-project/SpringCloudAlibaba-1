package com.ht.micro.record.redis.lock.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description JedisCluster方式锁连接
 * @className DistributedLockConfiguration
 * @Author onejane
 * @Date 2019/4/29 11:24
 * @Version 1.0
 **/
@Slf4j
@Configuration
public class RedisDistributedLockConfiguration {

    @Value("${spring.redis.cluster.nodes}")
    private  String cluster;

    @Bean
    public JedisCluster jedisCluster () {

        String [] nodesArray = cluster.split(",");
        Set<HostAndPort> nodes=new HashSet<>();
        for (String ipPort : nodesArray) {
            String [] ipPortP = ipPort.split(":");
            nodes.add(new HostAndPort(ipPortP[0],Integer.valueOf(ipPortP[1])));
        }
        return new JedisCluster(nodes,5000);
    }

}
