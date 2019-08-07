package com.ht.micro.record.service.dubbo.provider.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EsConfig {

    @Value("${es.nodes}")
    private String nodes;

    @Value("${es.host}")
    private String host;

    @Value("${es.port}")
    private String port;

    @Value("${es.blDbName}")
    private String blDbName;

    @Value("${es.jjDbName}")
    private String jjDbName;

    @Value("${es.cjDbName}")
    private String cjDbName;

    @Value("${es.jqfxDbName}")
    private String jqfxDbName;

    @Value("${es.clusterName}")
    private String clusterName;

    @Value("${es.jjDbName}")
    private String answerDbName;

    @Value("${es.cjDbName}")
    private String handleDbName;

    @Value("${es.cjjxqDbName}")
    private String cjjxqDbName;

    @Value("${es.jcjDbName}")
    private String jcjDbName;

    @Value("${es.daDbName}")
    private String daDbName;

    @Value("${es.daDbName}")
    private String fxDbName;

    @Value("${es.types}")
    private String types;

    @Value("${es.neo4jData}")
    private String neo4jData;

    @Value("${es.cityDbName}")
    private String cityDbName;

    public String getCityDbName() {
        return cityDbName;
    }

    public String getTypes() {
        return types;
    }

    public String getFxDbName() {
        return fxDbName;
    }

    public String getDaDbName() {
        return daDbName;
    }

    public String getJcjDbName() {
        return jcjDbName;
    }

    public String getCjjxqDbName() {
        return cjjxqDbName;
    }

    public String getNodes() {
        return nodes;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getClusterName() {
        return clusterName;
    }

    public String getBlDbName() {
        return blDbName;
    }

    public String getJjDbName() {
        return jjDbName;
    }

    public String getCjDbName() {
        return cjDbName;
    }

    public String getJqfxDbName() {

        return jqfxDbName;
    }

    public String getNeo4jData() {
        return neo4jData;
    }
}
