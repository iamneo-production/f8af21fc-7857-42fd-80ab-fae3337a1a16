package com.examly.springapp.repository;

import com.examly.springapp.entity.Signup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignupRepository extends JpaRepository<Signup, String> {
    
    
    
    Signup findByUserId(String userId);
    Signup save(Signup signup);
   

}


