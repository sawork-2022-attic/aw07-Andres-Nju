package com.micropos.delivery;

import com.micropos.delivery.repository.DeliveryRepository;
import com.micropos.delivery.repository.DeliveryRepositoryImpl;
import com.micropos.delivery.service.DeliveryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class DeliveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliveryApplication.class, args);
    }

    @Bean
    DeliveryRepository deliveryRepository() {
        return new DeliveryRepositoryImpl();
    }
}
