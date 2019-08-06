package com.ht.micro.record.commons;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Auther: codewj
 * @Date: 2019/7/22 11:56
 * @Description:
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CommonsMapperApplication {
    public static void main(String[] args) {

    }
}
