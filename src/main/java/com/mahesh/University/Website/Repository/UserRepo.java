package com.mahesh.University.Website.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahesh.University.Website.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
