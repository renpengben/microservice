package me.renpeng.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by renpeng on 16/8/6.
 */
@RestController
public class ApiServiceController {
    @Autowired
    CompositeServiceClient compositeServiceClient;
    @Autowired
    CoreService1Client coreService1Client;
    @Autowired
    CoreService2Client coreService2Client;

    @RequestMapping(value = "calculation", method = RequestMethod.GET)
    Integer calculation(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b, String type) {

        return compositeServiceClient.calculation(a, b, type);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b, String type) {

        return coreService1Client.add(a, b);
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.GET)
    Integer subtract(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b, String type) {

        return coreService2Client.subtract(a, b);
    }
}
