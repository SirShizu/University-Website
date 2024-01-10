package com.mahesh.University.Website.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.mahesh.University.Website.Entity.User;
import com.mahesh.University.Website.Repository.UserRepo;

@Controller
@SessionAttributes("loggedInUser")
public class AuthController {
    
    @Autowired
    private UserRepo userRepository;

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        User user = userRepository.findByEmail(email); // Fetch user by email
        if (user != null && user.getPassword().equals(password)) {
            model.addAttribute("loggedInUser", user); // Store user in session
            return "index";

        } else {
            return "redirect:/login?error"; 
        }
    }

    @RequestMapping(value = "/logout", method = { RequestMethod.POST})
    public String logout(SessionStatus status) {
        if (!status.isComplete()) {
            status.setComplete(); // Clear the session 
        }
        return "index"; // Redirect to login page after logout
    }
}
