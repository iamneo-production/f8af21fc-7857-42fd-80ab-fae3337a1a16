package com.examly.springapp.entity;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "signup")
public class Signup {



   @Id @GeneratedValue(generator="increment")
    private int userId;
    private String userrole;
    private String email;
    private String username;
    private String mobilenumber;
    private String password;
    private String confirmPassword;
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


    
   
}
    
    
    

    

