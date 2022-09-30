package com.examly.springapp.service;

import com.examly.springapp.entity.Institute;
import com.examly.springapp.repository.InstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InstituteService {
    @Autowired
    private InstituteRepository instituterepository;

   

    public Institute saveInstitute(Institute institute) {
        return instituterepository.save(institute);
    }
    
    public Institute getInstituteId(int instituteId){
        return instituterepository.findByInstituteId(instituteId);
    }


       
    public Institute deleteInstitute(Institute instituteId) {
        return instituterepository.deleteByInstituteId(instituteId);
        
    }
    

    public Institute updateInstitute(Institute institute) {
        Institute existingInstitute = instituterepository.findByInstituteId(institute.getInstituteId());
        existingInstitute.setInstituteId(institute.getInstituteId());
        existingInstitute.setInstitutename(institute.getInstitutename());
        existingInstitute.setInstitutedescription(institute.getInstitutedescription());
        existingInstitute.setInstituteaddress(institute.getInstituteaddress());
        existingInstitute.setMobilenumber(institute.getMobilenumber());
        existingInstitute.setEmail(institute.getEmail());
        return instituterepository.save(existingInstitute);
    }


}
