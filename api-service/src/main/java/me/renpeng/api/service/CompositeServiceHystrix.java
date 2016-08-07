package me.renpeng.api.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by renpeng on 16/8/6.
 */
@Component
public class CompositeServiceHystrix implements  CompositeServiceClient {
    @Override
    public Integer calculation(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b, String type) {
        return null;
    }
}
