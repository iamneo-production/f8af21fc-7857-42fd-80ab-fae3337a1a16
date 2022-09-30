package com.examly.springapp.repository;

import com.examly.springapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
    
    
    Course deleteByCoursename(Course coursename);
    Course findByCourseId(int courseId);
    Course findByCoursename(String coursename);
    Course save(Course course);
   

}


