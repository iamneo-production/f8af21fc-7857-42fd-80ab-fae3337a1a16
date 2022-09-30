package com.examly.springapp.service;

import com.examly.springapp.entity.Signup;
import com.examly.springapp.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SignupService {
    
    @Autowired
    private SignupRepository signuprepository;

   

    public Signup saveSignup(Signup signup) {
        return signuprepository.save(signup);
    }
    
    public Signup getUserId(int userId){
        return signuprepository.findByUserId(userId);
    }



}