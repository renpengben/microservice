package me.renpeng.core.service1;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * Created by renpeng on 16/7/29.
 */
@SpringCloudApplication
public class CoreService1Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CoreService1Application.class).web(true).run(args);
    }

//    @Bean
//    Sampler sampler() {
//        return new AlwaysSampler();
//    }
}
