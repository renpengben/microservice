package me.renpeng.core.service2;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * Created by renpeng on 16/7/29.
 */
@SpringCloudApplication
public class CoreService2Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CoreService2Application.class).web(true).run(args);
    }
//
//    @Bean
//    Sampler sampler() {
//        return new AlwaysSampler();
//    }
}
