package me.renpeng.composite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by renpeng on 16/7/29.
 */
@RestController
public class CalculationController {
    @Autowired
    CoreService1Client coreService1Client;
    @Autowired
    CoreService2Client coreService2Client;

    @RequestMapping(value = "/calculation", method = RequestMethod.GET)
    public Integer calculation(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b, String type) {
        Integer result = 0;
        if ("add".equals(type)) {
            result = coreService1Client.add(a, b);
        }
        if ("subtract".equals(type)) {
            result = coreService2Client.subtract(a, b);
        }

        return result;
    }
}
