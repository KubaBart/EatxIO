package com.example.eatx;

import com.example.eatx.user.User;
import com.example.eatx.user.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/")
    public String viewHomePage()
    {

        return "index";
    }

    @GetMapping("/logout")
    public String logout()
    {

        return "index";
    }



    @GetMapping("/register")
    public String register(Model model)
    {
        model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/registration")
            public String registration(User user)
    {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepo.save(user);
        return "index";
    }

}
