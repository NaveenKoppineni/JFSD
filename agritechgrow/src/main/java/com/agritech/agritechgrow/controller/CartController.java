package com.agritech.agritechgrow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @GetMapping("/cart")
    public String getCartPage() {
        return "cart"; // Ensure there is a `cart.html` in the `src/main/resources/templates` folder
    }
}
