package com.kshitija.palette.service;

import com.kshitija.palette.dto.SignupRequest;
import com.kshitija.palette.entity.User;
import com.kshitija.palette.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(SignupRequest request) {

        // Check if email already exists
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return "Email already registered";
        }

        // Create user object
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword()); // we'll encrypt later
        user.setRole("ARTIST");

        userRepository.save(user);

        return "User registered successfully!";
    }
}