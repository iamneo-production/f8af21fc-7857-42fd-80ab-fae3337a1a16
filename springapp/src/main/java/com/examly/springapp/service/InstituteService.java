package com.examly.springapp.service;

import com.examly.springapp.entity.Institute;
import com.examly.springapp.repository.InstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InstituteService {
    @Autowired
    private InstituteRepository repository;

   

    public Institute saveInstitute(Institute institute) {
        return repository.save(institute);
    }
    
    public Institute getInstituteId(int instituteId){
        return repository.findByInstituteId(instituteId);
    }


    public Institute getInstitutename(String institutename) {
        return repository.findByInstitutename(institutename);
    }
    
    public Institute deleteInstitute(Institute institutename) {
        return repository.deleteByInstitutename(institutename);
        
    }
    

    public Institute updateInstitute(Institute institute) {
        Institute existingInstitute = repository.findByInstitutename(institute.getInstitutename());
        existingInstitute.setInstituteId(institute.getInstituteId());
        existingInstitute.setInstitutename(institute.getInstitutename());
        existingInstitute.setInstitutedescription(institute.getInstitutedescription());
        existingInstitute.setInstituteaddress(institute.getInstituteaddress());
        existingInstitute.setMobilenumber(institute.getMobilenumber());
        existingInstitute.setEmail(institute.getEmail());
        return repository.save(existingInstitute);
    }


}
