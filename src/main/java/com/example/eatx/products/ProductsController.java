package com.example.eatx.products;

import com.example.eatx.restaurants.Restaurants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping("/menu")
    public String listAll(Model model)
    {
        List<Products> productsList = productsService.listAll();
        model.addAttribute("productsList",productsList);
        return "menu";
    }
}
