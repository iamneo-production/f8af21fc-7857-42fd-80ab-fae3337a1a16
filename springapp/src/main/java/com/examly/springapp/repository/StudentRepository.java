package com.examly.springapp.repository;

import com.examly.springapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
    
    
    Student deleteByStudentId(Student studentId);
    Student findByStudentId(int studentId);
    Student save(Student student);
   

}


