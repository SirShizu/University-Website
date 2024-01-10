package com.mahesh.University.Website.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.mahesh.University.Website.Entity.User;
import com.mahesh.University.Website.Repository.UserRepo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private UserRepo userRepository;

    @Autowired
    public UserController(UserRepo userRepository) {
        this.userRepository = userRepository;
    }
    
    @PostMapping("/registration_submission")
    public String processRegistration(User user, Model model) {
        userRepository.save(user);
        model.addAttribute("message", "Registration successful!");

        return "redirect:/LoginPage";
    }
    

}
