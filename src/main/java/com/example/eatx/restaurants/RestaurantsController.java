package com.example.eatx.restaurants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RestaurantsController {


    RestarutantsService restaurantsService;
    @GetMapping("/user_page")
    public String listAll(Model model)
    {
        return "user_page";
    }
}
