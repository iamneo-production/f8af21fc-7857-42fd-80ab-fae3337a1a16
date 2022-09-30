package com.examly.springapp.service;

import com.examly.springapp.entity.Student;
import com.examly.springapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

   

    public Student saveStudent(Student student) {
        return repository.save(student);
    }
    
    public Student getStudentId(int studentId){
        return repository.findByStudentId(studentId);
    }


    public Student getStudentname(String studentname) {
        return repository.findByStudentname(studentname);
    }
    
    public Student deleteStudent(Student studentname) {
        return repository.deleteByStudentname(studentname);
        
    }
    

    public Student updateStudent(Student student) {
        Student existingStudent = repository.findByStudentname(student.getStudentname());
        existingStudent.setStudentId(student.getStudentId());
        existingStudent.setStudentname(student.getStudentname());
        existingStudent.setStudentDOB(student.getStudentDOB());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setMobilenumber(student.getMobilenumber());
        return repository.save(existingStudent);
    }


}