package com.kshitija.palette.controller;

import com.kshitija.palette.dto.SignupRequest;
import com.kshitija.palette.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequest request) {
        return userService.registerUser(request);
    }
}