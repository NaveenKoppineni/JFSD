package com.agritech.agritechgrow.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class ContactController {

	    @PostMapping("/user/processcontact")
	    public String processContact(
	            @RequestParam("name") String name,
	            @RequestParam("email") String email,
	            @RequestParam("message") String message,
	            Model model) {

	        // Here, you can handle the logic for processing the registration
	        // For example, save the data to a database
	        System.out.println("Item Name: " + name);
	        System.out.println("Price: " + email);
	        System.out.println("Quantity: " + message);

	        // Add success message to the model (optional)
	        model.addAttribute("successMessage", "Item registered successfully!");

	        // Return the view for the success page
	        return "processcontact";
	    }
	}
