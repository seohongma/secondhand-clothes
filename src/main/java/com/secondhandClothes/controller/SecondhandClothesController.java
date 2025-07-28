package com.secondhandClothes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondhandClothesController {

	@GetMapping("/")
    public String home() {
        return "index";  // templates/home/index.html
    }
}
