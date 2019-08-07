package com.ht.micro.record.service.dubbo.provider.dubbo;

import com.ht.micro.record.service.dubbo.api.PortApi;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author codewj
 * @date 2019-07-15 13:35:30
 */
@Service
public class PortApiImpl implements PortApi {

    @Value("${server.port}")
    private Integer port;

    @Override
    public String showPort() {
        return "port= "+ port;
    }

}
