package me.renpeng.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册
 * Created by renpeng on 16/7/29.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }
}
