package com.example.demo.controller;


import com.example.demo.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcomePage(Model model) {
        model.addAttribute("title", "Welcome to SPRING");
        return "index";
    }

}
