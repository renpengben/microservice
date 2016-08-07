package me.renpeng.api.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by renpeng on 16/8/6.
 */
@FeignClient(value = "composite-service", fallback = CompositeServiceHystrix.class)
public interface CompositeServiceClient {
    @RequestMapping(value = "/calculation", method = RequestMethod.GET)
    Integer calculation(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b, String type);
}
