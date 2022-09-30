package com.examly.springapp.service;

import com.examly.springapp.entity.Course;
import com.examly.springapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CourseService {
    @Autowired
    private CourseRepository repository;

   

    public Course saveCourse(Course course) {
        return repository.save(course);
    }
    
    public Course getCourseId(int courseId){
        return repository.findByCourseId(courseId);
    }


    public Course getCoursename(String coursename) {
        return repository.findByCoursename(coursename);
    }
    
    public Course deleteCourse(Course coursename) {
        return repository.deleteByCoursename(coursename);
        
    }
    

    public Course updateCourse(Course course) {
        Course existingCourse = repository.findByCoursename(course.getCoursename());
        existingCourse.setCourseId(course.getCourseId());
        existingCourse.setCoursename(course.getCoursename());
        existingCourse.setDescription(course.getDescription());
        existingCourse.setDuration(course.getDuration());
        return repository.save(existingCourse);
    }


}