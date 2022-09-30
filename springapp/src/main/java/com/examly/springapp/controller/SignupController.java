package com.examly.springapp.controller;

import com.examly.springapp.entity.Signup;
import com.examly.springapp.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class SignupController {

    @Autowired
    private SignupService signupservice;

    @PostMapping("/addRegister")
    public Signup addRegister(@RequestBody Signup signup) {
        return signupservice.saveSignup(signup);
    }

    @GetMapping("/Register/{userId}")
    public Signup viewRegister(@RequestBody int userId){
        return signupservice.getUserId(userId);
    }

    
}
    