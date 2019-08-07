package com.ht.micro.record.service.dubbo.provider.utils;


import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 指定客户端IP组的客户端对象
 */
@Service
public class ElasticClientSingleton {
    protected final Logger logger = LoggerFactory.getLogger(ElasticClientSingleton.class);

    private AtomicInteger atomicPass = new AtomicInteger();    // 0 未初始化, 1 已初始化

    private TransportClient transportClient;
    private BulkRequestBuilder bulkRequest;


    public synchronized void init(EsConfig esConfig) {
        try {
            String ipArray = esConfig.getHost();
            String portArray = esConfig.getPort();
            String cluster = esConfig.getClusterName();

            Settings settings = Settings.builder()
                    .put("cluster.name", cluster)  //连接的集群名
                    .put("client.transport.ignore_cluster_name", true)
                    .put("client.transport.sniff", false)//如果集群名不对，也能连接
                    .build();
            transportClient = new PreBuiltTransportClient(settings);

            String[] ips = ipArray.split(",");
            String[] ports = portArray.split(",");
            for (int i = 0; i < ips.length; i++) {
                transportClient.addTransportAddress(new TransportAddress(InetAddress.getByName(ips[i]), Integer
                        .parseInt(ports[i])));
            }

            atomicPass.set(1);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());

            atomicPass.set(0);
            destroy();
        }
    }

    public void destroy() {
        if (transportClient != null) {
            transportClient.close();
            transportClient = null;
        }
    }

    public BulkRequestBuilder getBulkRequest(EsConfig esConfig) {
        if (atomicPass.get() == 0) {    // 初始化
            init(esConfig);
        }

        bulkRequest = transportClient.prepareBulk();

        return bulkRequest;
    }

    public TransportClient getTransportClient(EsConfig esConfig) {
        if (atomicPass.get() == 0) {    // 初始化
            init(esConfig);
        }

        return transportClient;
    }
}
