package com.examly.springapp.controller;

import com.examly.springapp.entity.Student;
import com.examly.springapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/viewStudent/{studentId}")
    public Student viewStudent(@RequestBody int studentId){
        return service.getStudentId(studentId);
    }

    @GetMapping("/studentname/{studentname}")
    public Student findByStudentname(@PathVariable String studentname) {
        return service.getStudentname(studentname);
    }


    @PutMapping("/updateStudent/{student}")
    public Student updateStudent(@PathVariable Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{studentname}")
    public Student deleteStudent(@PathVariable Student studentname) {
        return service.deleteStudent(studentname);
    }

}