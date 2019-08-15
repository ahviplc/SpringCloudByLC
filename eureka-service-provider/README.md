### eureka-service-provider By LC

eureka-service-provider这里eureka-service-provider\src\main\resources\application.properties配置:

```
# eureka-service-provider 服务提供者(生产者)
spring.application.name=spring-cloud-producer
server.port=9000
eureka.client.serviceUrl.defaultZone=http://localhost:8000/eureka/

```

eureka-service-provider启动工程后，访问：http://localhost:9000/hello?name=LC 获取返回的数据

先输入：http://localhost:9000/hello?name=LC  检查spring-cloud-producer服务是否正常

接下来还有服务提供与调用:

springcloud(三)：服务提供与调用 - 纯洁的微笑博客

> http://www.ityouknow.com/springcloud/2017/05/12/eureka-provider-constomer.html

### 总测试

简单调用

依次启动spring-cloud-eureka、spring-cloud-producer、spring-cloud-consumer三个项目

先输入：http://localhost:9000/hello?name=LC  检查spring-cloud-producer服务是否正常

返回：hello LC，this is first messge

说明spring-cloud-producer正常启动，提供的服务也正常。

浏览器中输入：http://localhost:9001/hello/LC

返回：hello LC，this is first messge

说明客户端已经成功的通过feign调用了远程服务hello，并且将结果返回到了浏览器。

### 其他 maven的package打包成jar以及运行jar包启动

> 1:运行maven的打包命令，mvn clean package -Ptest -Dmaven.test.skip=true

> 2:在其文件夹找到jar,在cmd/powershell命令窗口下执行运行jar包的命令：java -jar eureka-service-provider-0.0.1-SNAPSHOT.jar 即可启动

> SpringBoot项目运行jar包启动 - code_monkey的博客 - CSDN博客
 https://blog.csdn.net/qq_35860138/article/details/82701919

## 1：about me：

**欢迎来到 [LC博客-一加壹博客最Top](http://www.oneplusone.vip)**

**欢迎来到 [LC-Gitlab](https://gitlab.com/ahviplc)**

**欢迎来到 [LC-Github](https://github.com/ahviplc)**

**欢迎来到 [LC-Github-SpringCloudByLC](https://github.com/ahviplc/SpringCloudByLC)**

> ### LC最寄语：永远不要放弃自己心中最初的最初的理想！~LC

> from **2019年8月15日15:03:39**

> to **future**