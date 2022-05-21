package com.micropos.order.rest;

import com.micropos.api.OrdersApi;
import com.micropos.dto.CartDto;
import com.micropos.dto.OrderDto;
import com.micropos.order.mapper.OrderMapper;
import com.micropos.order.model.Order;
import com.micropos.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
@EnableDiscoveryClient
public class OrderController implements OrdersApi {

    private OrderMapper orderMapper;

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService, OrderMapper orderMapper) {
        this.orderService = orderService;
        this.orderMapper = orderMapper;
    }

    @Override
    @PostMapping()
    public ResponseEntity<OrderDto> createOrder(@RequestBody  CartDto cartDto) {
        //System.out.println("order controller: createOrder: " + cartDto.toString());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(new Date());

        Order order = orderService.createOrder(cartDto, date);
        if (order == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(orderMapper.toOrderDto(order),HttpStatus.OK);
    }


    @Override
    @GetMapping()
    public ResponseEntity<List<OrderDto>> listOrders() {
        List<OrderDto> orders = new ArrayList<>(orderMapper.toOrderDtos(orderService.getAllOrders()));
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @Override
    @GetMapping("/{orderId}")
    public ResponseEntity<OrderDto> showOrderById(@PathVariable("orderId") Integer orderId) {

        Order order = orderService.getOrder(orderId);
        if (order == null) {
            return ResponseEntity.notFound().build();
        }
        OrderDto orderDto = orderMapper.toOrderDto(order);
        return ResponseEntity.ok(orderDto);
    }
}
