package com.example.eatx.restaurants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestaurantsController {


    RestarutantsService restaurantsService;

    @GetMapping("/menu")
    public String showMenuRestaurants()
    {
        return "menu";
    }
}
