package com.deba.college.dcollege.service;

import com.deba.college.dcollege.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    User findByEmailId(String email);
    User save(User user);
    List<User> listUsers();
}
