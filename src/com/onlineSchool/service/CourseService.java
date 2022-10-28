package com.onlineSchool.service;

import com.onlineSchool.classes.Course;

public class CourseService {


    public Course creatCourse(int courseId) {
               return new Course(courseId);
    }
}
