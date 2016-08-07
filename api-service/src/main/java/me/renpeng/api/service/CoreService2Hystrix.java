package me.renpeng.api.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by renpeng on 16/7/29.
 */
@Component
public class CoreService2Hystrix implements CoreService2Client {
    @Override
    public Integer subtract(@RequestParam(value = "a")  Integer a, @RequestParam(value = "b")  Integer b) {
        return -1024;
    }
}
