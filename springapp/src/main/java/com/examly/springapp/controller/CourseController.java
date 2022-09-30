package com.examly.springapp.controller;

import com.examly.springapp.entity.Course;
import com.examly.springapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }

    @GetMapping("/viewCourse/{courseId}")
    public Course viewCourse(@RequestBody int courseId){
        return service.getCourseId(courseId);
    }

    @GetMapping("/coursename/{coursename}")
    public Course findByCoursename(@PathVariable String coursename) {
        return service.getCoursename(coursename);
    }


    @PutMapping("/updateCourse/{course}")
    public Course updateCourse(@PathVariable Course course) {
        return service.updateCourse(course);
    }

    @DeleteMapping("/deleteCourse/{coursename}")
    public Course deleteCourse(@PathVariable Course coursename) {
        return service.deleteCourse(coursename);
    }

}