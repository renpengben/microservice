package me.renpeng.api.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by renpeng on 16/7/29.
 */
@EnableZuulProxy
//@EnableResourceServer
@SpringCloudApplication
public class ApiApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiApplication.class).web(true).run(args);
    }


}
