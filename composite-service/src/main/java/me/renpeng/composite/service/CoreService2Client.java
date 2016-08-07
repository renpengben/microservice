package me.renpeng.composite.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by renpeng on 16/7/29.
 */
@FeignClient(value = "core-service-2", fallback = CoreService2Hystrix.class)
public interface CoreService2Client {
    @RequestMapping(method = RequestMethod.GET, value = "/subtract")
    Integer subtract(@RequestParam(value = "a")  Integer a, @RequestParam(value = "b")  Integer b);
}
