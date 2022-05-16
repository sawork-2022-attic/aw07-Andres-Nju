# aw07

Please extend your MicroPOS system by adding a delivery service shown as the following figure.

![](10-pos.svg)

When an order is placed by a user, the order serivce sends out an event into some AMQP MOM (such as RabbitMQ). The delivery service will be notified and a new delivery entry will be generated automatically. User can query the delivery status for his orders.

Use [Spring Cloud Stream](https://spring.io/projects/spring-cloud-stream) to make the scenerio happen. Of coz you can refer to the [demo](https://github.com/sa-spring/stream-loan) for technical details.



### 修复了作业5中框架的部分bug

- 感谢id为“AldrichZeng”的学长在作业5报告中提到的关于`cartsRepository.save(cart)`会报错的bug，改用了本地存储购物车信息
  - 自己实现一个`CartRepositoryImpl`类继承老师提供的`CartRepository`接口，在该类中定义一个cart的List存放carts信息

