package me.renpeng.composite.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by renpeng on 16/7/29.
 */
@EnableFeignClients
@SpringCloudApplication
public class CompositeServiceApplication {
    private final static Logger logger = LoggerFactory.getLogger(CompositeServiceApplication.class.getClass());

    public static void main(String[] args) {
        SpringApplication.run(CompositeServiceApplication.class, args);
    }

//    @Bean
//    AlwaysSampler alwaysSampler(){
//        return new AlwaysSampler();
//    }
}
