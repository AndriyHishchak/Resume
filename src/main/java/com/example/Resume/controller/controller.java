package com.example.Resume.controller;

import com.example.Resume.model.User;
import com.example.Resume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class controller {

    private UserService userService;
    @Autowired
    public controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/page")
    public String index(Model model){
        model.addAttribute("users",userService.getAll());
        return "index";
    }
    @GetMapping("/")
    public String home(Model model){
        return "home";
    }

    @GetMapping("/sign-in")
    public String login (){
        return "TestSign-in";
    }

    @GetMapping("/sign-up")
    public String registration () {
        return "TestSign-up";
    }
    @PostMapping("/sign-up")
    public String save( User user) {
        userService.register(user);
        return "redirect:/sign-in";
    }
}
