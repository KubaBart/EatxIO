package com.example.eatx.cart;

import com.example.eatx.user.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CartService {

    @Autowired
    private CartRepository cartRepo;
    public List<Carts> listCartItems(User user)
    {
        return cartRepo.findByUser(user);
    }
}
