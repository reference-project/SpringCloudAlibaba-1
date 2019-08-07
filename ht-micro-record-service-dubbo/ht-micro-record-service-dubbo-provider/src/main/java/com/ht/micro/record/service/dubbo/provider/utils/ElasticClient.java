package com.ht.micro.record.service.dubbo.provider.utils;


import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

/**
 * 指定客户端IP组的客户端对象
 *
 * @author Administrator
 */
@Service
public class ElasticClient {
    @Autowired
    private EsConfig esConfig;

    private static final Logger logger = LoggerFactory.getLogger(ElasticClient.class);
    
    private static BulkRequestBuilder bulkRequest;

    @Autowired
    private  ElasticClientSingleton elasticClientSingleton;
    @PostConstruct
    public void init() {

    	bulkRequest = elasticClientSingleton.getBulkRequest(esConfig);
    }



    

    /**
     * @param url
     * @param query
     * @return
     * @Description 发送请求
     * @Author 裴健(peij@htdatacloud.com)
     * @Date 2016年6月13日
     * @History
     * @his1
     */
    public static String postRequest(String url, String query) {
        RestTemplate restTemplate = new RestTemplate();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        HttpEntity<String> formEntity = new HttpEntity<String>(query, headers);
        String result = restTemplate.postForObject(url, formEntity, String.class);

        return result;
    }



    /**
     * action 提交操作
     */
//    public void action() {
//        int reqSize = bulkRequest.numberOfActions();
//        //读不到数据了，默认已经全部读取
//        if (reqSize == 0) {
//            bulkRequest.request().requests().clear();
//        }
//        bulkRequest.setTimeout(new TimeValue(1000 * 60 * 5)); //超时30秒
//        BulkResponse bulkResponse = bulkRequest.execute().actionGet();
//        //持久化异常
//        if (bulkResponse.hasFailures()) {
//            logger.error(bulkResponse.buildFailureMessage());
//            bulkRequest.request().requests().clear();
//        }
//        logger.info("import over...." + bulkResponse.getItems().length);
//    }


}
