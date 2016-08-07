package me.renpeng.core.service2;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by renpeng on 16/7/29.
 */
@RestController
public class CoreService2Controller {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/subtract", method = RequestMethod.GET)
    public Integer subtract(@RequestParam Integer a, @RequestParam Integer b) {
        //服务实例相关内容
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        Integer r = a - b;
        logger.info("/subtract, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
}
