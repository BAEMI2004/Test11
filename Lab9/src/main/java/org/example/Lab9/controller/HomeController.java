package org.example.Lab9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/products")
    public String homePage(){
        return "ProducManagement";
    }

}
