package com.examly.springapp.repository;

import com.examly.springapp.entity.Institute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituteRepository extends JpaRepository<Institute, String> {
    
    
    Institute deleteByInstituteId(Institute instituteId);
    Institute findByInstituteId(int instituteId);
    Institute save(Institute institute);
   

}


