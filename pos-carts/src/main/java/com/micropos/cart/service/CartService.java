package com.micropos.cart.service;

import com.micropos.cart.model.Cart;
import com.micropos.cart.model.Item;
import com.micropos.dto.OrderDto;
import java.util.List;
import java.util.Optional;

public interface CartService {

    Double checkTotal(Cart cart);

    Double checkTotal(Integer cartId);

    OrderDto checkOut(Cart cart);

    OrderDto checkOut(Integer cartId);

    Cart add(Cart cart, Item item);

    List<Cart> getAllCarts();

    Cart getCart(Integer cartId);

    Integer test();

    public Cart addCart(Cart cart);
}
