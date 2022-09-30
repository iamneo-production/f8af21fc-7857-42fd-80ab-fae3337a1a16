package com.examly.springapp.repository;

import com.examly.springapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
    
    
    Student deleteByStudentname(Student studentname);
    Student findByStudentId(int studentId);
    Student findByStudentname(String studentname);
    Student save(Student student);
   

}


