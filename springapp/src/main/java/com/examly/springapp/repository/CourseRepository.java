package com.examly.springapp.repository;

import com.examly.springapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
    
    
    Course deleteByCourseId(Course courseId);
    Course findByCourseId(int courseId);
    Course save(Course course);
   

}


