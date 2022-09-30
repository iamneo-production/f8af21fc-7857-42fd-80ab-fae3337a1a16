package com.examly.springapp.controller;

import com.examly.springapp.entity.Student;
import com.examly.springapp.service.StudentService;
import com.examly.springapp.entity.Course;
import com.examly.springapp.service.CourseService;
import com.examly.springapp.entity.Institute;
import com.examly.springapp.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    private StudentService studentservice;
    private CourseService courseservice;
    private InstituteService instituteservice;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentservice.saveStudent(student);
    }

    @GetMapping("/viewStudent/{studentId}")
    public Student viewStudent(@RequestBody int studentId){
        return studentservice.getStudentId(studentId);
    }


    @PutMapping("/updateStudent/{student}")
    public Student updateStudent(@PathVariable Student student) {
        return studentservice.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{studentId}")
    public Student deleteStudent(@PathVariable Student studentId) {
        return studentservice.deleteStudent(studentId);
    }

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return courseservice.saveCourse(course);
    }

    @GetMapping("/viewCourse/{courseId}")
    public Course viewCourse(@RequestBody int courseId){
        return courseservice.getCourseId(courseId);
    }



    @PutMapping("/updateCourse/{course}")
    public Course updateCourse(@PathVariable Course course) {
        return courseservice.updateCourse(course);
    }

    @DeleteMapping("/deleteCourse/{courseId}")
    public Course deleteCourse(@PathVariable Course courseId) {
        return courseservice.deleteCourse(courseId);
    }

    @PostMapping("/addInstitute")
    public Institute addInstitute(@RequestBody Institute institute) {
        return instituteservice.saveInstitute(institute);
    }

    @GetMapping("/viewInstitute/{instituteId}")
    public Institute viewInstitute(@RequestBody int instituteId){
        return instituteservice.getInstituteId(instituteId);
    }



    @PutMapping("/updateInstitute/{institute}")
    public Institute updateInstitute(@PathVariable Institute institute) {
        return instituteservice.updateInstitute(institute);
    }

    @DeleteMapping("/deleteInstitute/{instituteId}")
    public Institute deleteInstitute(@PathVariable Institute instituteId) {
        return instituteservice.deleteInstitute(instituteId);
    }

}


