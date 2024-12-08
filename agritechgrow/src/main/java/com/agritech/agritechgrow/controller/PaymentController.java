package com.agritech.agritechgrow.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaymentController {

    // Display the payment page with the amount from the cart
    @GetMapping("/payment")
    public String showPaymentPage(@RequestParam("total") String totalAmount, Model model) {
        // Pass the total amount to the payment page
        model.addAttribute("totalAmount", totalAmount);
        return "payment"; // This will render payment.html (your payment page)
    }
}
