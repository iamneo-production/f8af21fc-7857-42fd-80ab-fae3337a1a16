package com.examly.springapp.controller;

import com.examly.springapp.entity.Institute;
import com.examly.springapp.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class InstituteController {

    @Autowired
    private InstituteService service;



    @PostMapping("/addInstitute")
    public Institute addInstitute(@RequestBody Institute institute) {
        return service.saveInstitute(institute);
    }

    @GetMapping("/viewInstitute/{instituteId}")
    public Institute viewInstitute(@RequestBody int instituteId){
        return service.getInstituteId(instituteId);
    }

    @GetMapping("/institutename/{institutename}")
    public Institute findByInstitutename(@PathVariable String institutename) {
        return service.getInstitutename(institutename);
    }


    @PutMapping("/updateInstitute/{institute}")
    public Institute updateInstitute(@PathVariable Institute institute) {
        return service.updateInstitute(institute);
    }

    @DeleteMapping("/deleteInstitute/{institutename}")
    public Institute deleteInstitute(@PathVariable Institute institutename) {
        return service.deleteInstitute(institutename);
    }

    



}
