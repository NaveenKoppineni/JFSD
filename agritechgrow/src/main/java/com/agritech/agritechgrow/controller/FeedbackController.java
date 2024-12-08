package com.agritech.agritechgrow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {

    // Serve the feedback form
    @GetMapping("/feedback")
    public String showFeedbackForm() {
        return "feedback"; // This corresponds to feedback.html
    }

    // Handle feedback form submission
    @PostMapping("/submitFeedback")
    public String submitFeedback(String feedback, Model model) {
        // Logic to handle feedback (e.g., save to database or send via email)
        System.out.println("Feedback received: " + feedback);

        // Add success message to the model
        model.addAttribute("message", "Thank you for your feedback!");

        // Redirect to a success page or the same feedback page
        return "feedback"; // This will reload the feedback page with the success message
    }
}
