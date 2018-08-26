# 公益 Eureka Service

服务注册中心在微服务开发中是必不可少的，公益 Eureka Service是一个服务中心，供大家免费使用，方便调试开发。

## 如何使用

在Spring Cloud应用的配置文件中，设置eureka的地址为： http://eureka.fengwenyi.com/eureka/

`yml`配置方式：

```yaml
eureka:
  client:
    service-url:
      defaultZone: http://eureka.fengwenyi.com/eureka/
```

`properties`配置方式：

```properties
eureka.client.service-url.defaultZone=http://eureka.fengwenyi.com/eureka/
```


## 注意事项
由于本Eureka Service为公益应用，旨在帮助Spring Cloud的开发者进行学习和调试开发使用。
可能存在运行不稳定而重启等风险，请勿将该注册中心用于您的生产配置中。
同时，为了保障大家使用的顺畅，使用者请勿对本注册中心进行压力测试。
如在学习与使用过程中遇到困难，欢迎一起探讨交流（xfsy_2015@163.com）。

## 参考资料

[1] [公益Eureka Server - 程序猿DD](http://eureka.didispace.com/)

[2] [didi-eureka-server](https://github.com/dyc87112/didi-eureka-server)

[3] [微服务架构：Eureka参数配置项详解](https://www.cnblogs.com/fangfuhai/p/7070325.html)

## 关注我
[1] [Github](https://github.com/fengwenyi)

[2] [慕课网](https://www.imooc.com/u/2815937)

[3] [简书](https://www.jianshu.com/u/c1a1f1fefc78)

[4] [开源中国](https://my.oschina.net/fengwenyi)

[5] [CSDN](https://me.csdn.net/qq_28336351)