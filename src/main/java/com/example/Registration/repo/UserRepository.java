package com.example.Registration.repo;

import com.example.Registration.entity.cms.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
