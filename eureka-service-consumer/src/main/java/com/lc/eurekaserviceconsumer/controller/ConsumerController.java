package com.lc.eurekaserviceconsumer.controller;

import com.lc.eurekaserviceconsumer.service.HelloRemote;
import com.lc.eurekaserviceconsumer.service.HelloRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller控制器
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    @Autowired
    HelloRemoteService helloRemoteService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

    @RequestMapping("helloByLC")
    public String helloByLC() {
        return helloRemoteService.hello("helloByLC");
    }

}