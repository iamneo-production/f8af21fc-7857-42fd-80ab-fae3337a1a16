package com.examly.springapp.service;

import com.examly.springapp.entity.Student;
import com.examly.springapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentrepository;

   

    public Student saveStudent(Student student) {
        return studentrepository.save(student);
    }
    
    public Student getStudentId(int studentId){
        return studentrepository.findByStudentId(studentId);
    }


    
    public Student deleteStudent(Student studentId) {
        return studentrepository.deleteByStudentId(studentId);
        
    }
    

    public Student updateStudent(Student student) {
        Student existingStudent = studentrepository.findByStudentId(student.getStudentId());
        existingStudent.setStudentId(student.getStudentId());
        existingStudent.setStudentname(student.getStudentname());
        existingStudent.setStudentDOB(student.getStudentDOB());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setMobilenumber(student.getMobilenumber());
        return studentrepository.save(existingStudent);
    }


}