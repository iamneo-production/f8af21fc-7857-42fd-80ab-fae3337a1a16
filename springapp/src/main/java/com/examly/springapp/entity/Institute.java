package com.examly.springapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "institute")
public class Institute {


   @Id @GeneratedValue(generator="increment")
   
    private int instituteId;
    private String institutename;
    private String institutedescription;
    private String instituteaddress;
    private String mobilenumber;
    private String email;
    

    public int getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(int instituteId) {
        this.instituteId = instituteId;
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public String getInstitutedescription() {
        return institutedescription;
    }

    public void setInstitutedescription(String institutedescription) {
        this.institutedescription = institutedescription;
    }

    public String getInstituteaddress() {
        return instituteaddress;
    }

    public void setInstituteaddress(String instituteaddress) {
        this.instituteaddress = instituteaddress;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
     
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
