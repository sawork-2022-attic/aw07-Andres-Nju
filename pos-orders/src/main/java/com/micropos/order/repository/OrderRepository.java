package com.micropos.order.repository;

import com.micropos.order.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository<Order, Integer> {
    List<Order> findAllOrders();
    Order findOrderById(int id);
    List<Order> findItemsOfOrder(int id);
    com.micropos.order.model.Order saveOrder(com.micropos.order.model.Order order);
}
