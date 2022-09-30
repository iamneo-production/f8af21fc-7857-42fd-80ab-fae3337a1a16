package com.examly.springapp.service;

import com.examly.springapp.entity.Course;
import com.examly.springapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CourseService {
    @Autowired
    private CourseRepository courserepository;

   

    public Course saveCourse(Course course) {
        return courserepository.save(course);
    }
    
    public Course getCourseId(int courseId){
        return courserepository.findByCourseId(courseId);
    }

    
    public Course deleteCourse(Course courseId) {
        return courserepository.deleteByCourseId(courseId);
        
    }
    

    public Course updateCourse(Course course) {
        Course existingCourse = courserepository.findByCourseId(course.getCourseId());
        existingCourse.setCourseId(course.getCourseId());
        existingCourse.setCoursename(course.getCoursename());
        existingCourse.setDescription(course.getDescription());
        existingCourse.setDuration(course.getDuration());
        return courserepository.save(existingCourse);
    }


}