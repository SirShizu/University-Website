package com.mahesh.University.Website.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/LoginPage")
    public String getLoginPage() {
        return "LoginPage";
    }
    
    @GetMapping("/RegistrationPage")
    public String getRegistrationPage(){
        return "RegistrationPage";
    }

    @GetMapping("/ContactUs")
    public String getContactPage(){
        return "ContactUs";
    }
}
