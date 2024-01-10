package com.mahesh.University.Website.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.mahesh.University.Website.Entity.EnquiryUser;
import com.mahesh.University.Website.Repository.EnquiryUserRepo;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EnquiryUserController {
    
    @Autowired
    private EnquiryUserRepo enquiryUserRepository;

    @PostMapping("/save_enquiry_user")
    public String saveEnquiryUser(EnquiryUser user) {
        enquiryUserRepository.save(user);
        return "index";
    }
    
}
