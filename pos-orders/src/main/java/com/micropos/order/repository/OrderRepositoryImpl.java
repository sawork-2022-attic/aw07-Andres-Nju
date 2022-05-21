package com.micropos.order.repository;

import com.micropos.order.model.Order;
import com.micropos.order.model.Item;

import java.util.ArrayList;
import java.util.List;
public class OrderRepositoryImpl implements OrderRepository {
    private List<Order> orders = new ArrayList<>();

    @Override
    public List<Order> findAllOrders() {
        return this.orders;
    }

    @Override
    public Order findOrderById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    @Override
    public List<Item> findItemsOfOrder(int id) {
        Order order = this.findOrderById(id);
        if (order != null) {
            return order.getItems();
        } else {
            return null;
        }
    }

    @Override
    public Order saveOrder(Order order) {
        order.setId(orders.size());
        if (orders.add(order)) {
            return order;
        }
        return null;
    }
}
