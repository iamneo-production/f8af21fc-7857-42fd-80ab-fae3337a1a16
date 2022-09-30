package com.examly.springapp.entity;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student {


   @Id @GeneratedValue(generator="increment")
   
    private int studentId;
    private String studentname;
    private Date studentDOB;
    private String address;
    private String mobilenumber;
    

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Date getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(Date studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    

    
   
}
    
    
    

    

