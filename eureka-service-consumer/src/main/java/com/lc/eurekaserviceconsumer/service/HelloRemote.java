package com.lc.eurekaserviceconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @FeignClient(name = "spring-cloud-producer")
 * 注意：
 * name:远程服务名，及spring.application.name配置的名称
 */
@FeignClient(name = "spring-cloud-producer")
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
