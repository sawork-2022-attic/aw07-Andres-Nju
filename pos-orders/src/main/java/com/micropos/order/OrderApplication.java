package com.micropos.order;

import com.micropos.dto.OrderDto;
import com.micropos.order.repository.OrderRepository;
import com.micropos.order.repository.OrderRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.function.Supplier;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    @Bean
    OrderRepository orderRepository() {
        return new OrderRepositoryImpl();
    }
}
