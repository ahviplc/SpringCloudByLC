package com.lc.eurekaserviceprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * hello
     * @param name
     * @return
     *
     * 备注:可以负载均衡
     *     @RequestMapping("/hello")
     *     public String index(@RequestParam String name) {
     *         return "hello " + name + "，this is first messge 负载均衡9003端口";
     *     }
     */
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + "，this is first messge";
    }
}
