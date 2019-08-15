package com.lc.eurekaserviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 添加@EnableDiscoveryClient注解后，项目就具有了服务注册的功能。启动工程后，就可以在注册中心的页面看到SPRING-CLOUD-PRODUCER服务
 * 添加@EnableFeignClients注解后，就可以启用feign进行远程调用
 */

@SpringBootApplication
@EnableDiscoveryClient //@EnableDiscoveryClient注解 启用服务注册与发现
@EnableFeignClients //@EnableFeignClients注解 启用feign进行远程调用
public class EurekaServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceConsumerApplication.class, args);
    }

}
