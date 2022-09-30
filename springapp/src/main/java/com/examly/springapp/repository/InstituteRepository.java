package com.examly.springapp.repository;

import com.examly.springapp.entity.Institute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituteRepository extends JpaRepository<Institute, String> {
    
    
    Institute deleteByInstitutename(Institute institutename);
    Institute findByInstituteId(int instituteId);
    Institute findByInstitutename(String institutename);
    Institute save(Institute institute);
   

}


