### eurekaserver By LC

springcloud(二)：注册中心Eureka - 纯洁的微笑博客

> http://www.ityouknow.com/springcloud/2017/05/10/springcloud-eureka.html

Eureka的基本架构，由3个角色组成：

1、Eureka Server 提供服务注册和发现

2、Service Provider 服务提供方,将自身服务注册到Eureka，从而使服务消费方能够找到

3、Service Consumer 服务消费方,从Eureka获取注册服务列表，从而能够消费服务

配置项说明:

eureka.client.register-with-eureka ：表示是否将自己注册到Eureka Server，默认为true。

eureka.client.fetch-registry ：表示是否从Eureka Server获取注册信息，默认为true。

eureka.client.serviceUrl.defaultZone ：设置与Eureka Server交互的地址，查询服务和注册服务都需要依赖这个地址。默认是http://localhost:8761/eureka ；多个地址可使用 , 分隔。

此项目配置如下：

```
spring.application.name=spring-cloud-eureka
server.port=8000
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
eureka.client.serviceUrl.defaultZone=http://localhost:${server.port}/eureka/
```

#### 集群

注册中心这么关键的服务，如果是单点话，遇到故障就是毁灭性的。在一个分布式系统中，服务注册中心是最重要的基础部分，理应随时处于可以提供服务的状态。为了维持其可用性，使用集群是很好的解决方案。Eureka通过互相注册的方式来实现高可用的部署，所以我们只需要将Eureke Server配置其他可用的serviceUrl就能实现高可用部署。

##### 双节点注册中心 和 eureka集群使用

具体集群使用说明见：

springcloud(二)：注册中心Eureka - 纯洁的微笑博客

> http://www.ityouknow.com/springcloud/2017/05/10/springcloud-eureka.html

eurekaserver启动工程后，访问：http://localhost:8000/，可以看到下面的页面，其中还没有发现任何服务

## 其他：

接下来还有服务提供与调用:

springcloud(三)：服务提供与调用 - 纯洁的微笑博客

> http://www.ityouknow.com/springcloud/2017/05/12/eureka-provider-constomer.html

### 测试

简单调用

依次启动spring-cloud-eureka、spring-cloud-producer、spring-cloud-consumer三个项目

先输入：http://localhost:9000/hello?name=LC  检查spring-cloud-producer服务是否正常

返回：hello LC，this is first messge

说明spring-cloud-producer正常启动，提供的服务也正常。

浏览器中输入：http://localhost:9001/hello/LC

返回：hello LC，this is first messge

说明客户端已经成功的通过feign调用了远程服务hello，并且将结果返回到了浏览器。

## 1：about me：

**欢迎来到 [LC博客-一加壹博客最Top](http://www.oneplusone.vip)**

**欢迎来到 [LC-Gitlab](https://gitlab.com/ahviplc)**

**欢迎来到 [LC-Github](https://github.com/ahviplc)**

**欢迎来到 [LC-Github-SpringCloudByLC](https://github.com/ahviplc/SpringCloudByLC)**

> ### LC最寄语：永远不要放弃自己心中最初的最初的理想！~LC

> from **2019年8月15日15:03:16**

> to **future**