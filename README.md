# visit  through gateway
- url 127.0.0.1:8888/test/?a=1&b=2&c=["2020-04-13T16:00:00.000Z","2020-04-23T16:00:00.000Z"]
- result ParamEntity{a='1', b='2', c='[%222020-04-13T16:00:00.000Z%22,%222020-04-23T16:00:00.000Z%22]'}

```
spring:
  application:
    name: gateway-client
  cloud:
    gateway:
      routes:
        - id: test
          uri: http://127.0.0.1:8080
          predicates:
            - Path=/test/**
          filters:
            - StripPrefix=1
server:
  port: 8888
```
# visit  direct
- url 127.0.0.1:8080/?a=1&b=2&c=["2020-04-13T16:00:00.000Z","2020-04-23T16:00:00.000Z"]
- result ParamEntity{a='1', b='2', c='["2020-04-13T16:00:00.000Z","2020-04-23T16:00:00.000Z"]'}
# visit through gateway but use server 
#### it will same as direct

```
spring:
  application:
    name: gateway-client
  cloud:
    gateway:
      routes:
        - id: test
          uri: server  
          predicates:
            - Path=/test/**
          filters:
            - StripPrefix=1
server:
  port: 8888
```
