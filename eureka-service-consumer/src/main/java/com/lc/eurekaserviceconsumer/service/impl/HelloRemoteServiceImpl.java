package com.lc.eurekaserviceconsumer.service.impl;

import com.lc.eurekaserviceconsumer.service.HelloRemoteService;
import org.springframework.stereotype.Service;

@Service
public class HelloRemoteServiceImpl implements HelloRemoteService {
    @Override
    public String hello(String name) {
        return "你好" + name;
    }
}
