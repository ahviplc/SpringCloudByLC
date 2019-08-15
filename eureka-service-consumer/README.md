## eureka-service-consumer By LC

> eureka-service-consumer这里eureka-service-consumer\src\main\resources\application.properties配置:

```
# eureka-service-consumer 服务消费者
spring.application.name=spring-cloud-consumer
server.port=9001
eureka.client.serviceUrl.defaultZone=http://localhost:8000/eureka/

```
## Feign 注意：pom.xml还需要引入Feign

> Feign是一个声明式Web Service客户端。使用Feign能让编写Web Service客户端更加简单, 它的使用方法是定义一个接口，然后在上面添加注解，同时也支持JAX-RS标准的注解。Feign也支持可拔插式的编码器和解码器。Spring Cloud对Feign进行了封装，使其支持了Spring MVC标准注解和HttpMessageConverters。Feign可以与Eureka和Ribbon组合使用以支持负载均衡。

> 使用的feign时在pom.xml中的依赖为：

```
<!-- SpringCloud 整合 Feign -->
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>

```

> eureka-service-consumer启动工程后，访问：http://localhost:9001/hello/LC 获取返回的数据

先输入：http://localhost:9000/hello?name=LC  检查spring-cloud-producer服务是否正常

再输入：http://localhost:9001/hello/LC  调用远程服务hello

此也可以输入：http://localhost:9001/helloByLC 看是否返回【你好helloByLC】

接下来还有服务提供与调用:

springcloud(三)：服务提供与调用 - 纯洁的微笑博客

> http://www.ityouknow.com/springcloud/2017/05/12/eureka-provider-constomer.html

## 总测试

### 简单调用

依次启动spring-cloud-eureka、spring-cloud-producer、spring-cloud-consumer三个项目

先输入：http://localhost:9000/hello?name=LC  检查spring-cloud-producer服务是否正常

返回：hello LC，this is first messge

说明spring-cloud-producer正常启动，提供的服务也正常。

浏览器中输入：http://localhost:9001/hello/LC

返回：hello LC，this is first messge

说明客户端已经成功的通过feign调用了远程服务hello，并且将结果返回到了浏览器。

### 负载均衡 请继续看以下教程

> springcloud(三)：服务提供与调用 - 纯洁的微笑博客
  http://www.ityouknow.com/springcloud/2017/05/12/eureka-provider-constomer.html

## 1：about me：

**欢迎来到 [LC博客-一加壹博客最Top](http://www.oneplusone.vip)**

**欢迎来到 [LC-Gitlab](https://gitlab.com/ahviplc)**

**欢迎来到 [LC-Github](https://github.com/ahviplc)**

**欢迎来到 [LC-Github-SpringCloudByLC](https://github.com/ahviplc/SpringCloudByLC)**

> ### LC最寄语：永远不要放弃自己心中最初的最初的理想！~LC

> from **2019年8月15日15:03:31**

> to **future**