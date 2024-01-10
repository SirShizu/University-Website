package com.mahesh.University.Website.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahesh.University.Website.Entity.EnquiryUser;

public interface EnquiryUserRepo extends JpaRepository<EnquiryUser, Long>{
    
}
