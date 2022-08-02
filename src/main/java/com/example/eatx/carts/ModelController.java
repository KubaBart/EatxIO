package com.example.eatx.carts;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public class ModelController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @ModelAttribute
    public void populateModel(Model model, HttpServletRequest request) {
        String sessionToken = (String) request.getSession(true).getAttribute("sessiontToken");
        if (sessionToken == null) {
            model.addAttribute("shoppingCart", new ShoppingCart());

        } else {
            model.addAttribute("shoppingCart", shoppingCartService.getShoppingCartBySessionTokent(sessionToken));

        }
    }
}
