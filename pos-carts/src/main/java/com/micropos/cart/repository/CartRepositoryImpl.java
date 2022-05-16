package com.micropos.cart.repository;

import com.micropos.cart.model.Cart;
import com.micropos.cart.model.Item;
import com.micropos.dto.ProductDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@Repository
public class CartRepositoryImpl implements CartRepository {

    private List<Cart> carts = new ArrayList<>();

    @Override
    public List<Cart> findAllCarts() {
        return this.carts;
    }

    @Override
    public Cart findCartById(int id) {
        for (Cart cart : carts) {
            if (cart.getId() == id) {
                return cart;
            }
        }
        return null;
    }

    @Override
    public List<Item> findItemsOfCart(int id) {
        Cart cart = this.findCartById(id);
        if (cart != null) {
            return cart.getItems();
        } else {
            return null;
        }
    }

    @Override
    public Cart saveCart(Cart cart) {
        cart.setId(carts.size());
        cart.setItems(new ArrayList<>());
        if (carts.add(cart)) {
            return cart;
        }
        return null;
    }

    @Override
    public boolean addItemToCart(int cartId, Item item) {
        Cart cart = this.findCartById(cartId);
        if(ModifyItem(cartId, item)){
            return true;
        }
        return cart.addItem(item);
    }

    @Override
    public boolean ModifyItem(int cartId, Item item) {
        Cart cart = this.findCartById(cartId);
        for(Item it : cart.getItems()){
            if(it.getProductId().equals(item.getProductId())){
                cart.getItems().set(cart.getItems().indexOf(it), item);
                return true;
            }
        }
        return false;
    }
}