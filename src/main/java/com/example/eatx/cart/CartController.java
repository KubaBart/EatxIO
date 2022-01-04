package com.example.eatx.cart;

import com.example.eatx.user.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {


    private CartService cartService;
    private CustomUserDetailsService userService;

    @GetMapping("/shopping_cart")
    public String showShoppingCart(Model model,
                                   @AuthenticationPrincipal Authentication authentication)
    {
        return "shopping_cart";
    }


}
