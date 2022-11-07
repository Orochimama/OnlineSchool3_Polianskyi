package com.onlineSchool.repository;

import com.onlineSchool.classes.Course;
import com.onlineSchool.classes.Student;

public class CourseRepository {
    private int CAPACITY = 10;
    private Course[] coursesArray = new Course[CAPACITY];

    public void addTeacher(Course course) {
        for (int i = 0; i < coursesArray.length; i++) {
            if (coursesArray[i] == null) {
                coursesArray[i] = course;
                break;
            } else {
                System.out.println("Array imprive!");
                expandArray();
            }
        }
    }

    private void expandArray() {
        int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 + 1;
        Course[] tmpCoursesArray = new Course[CAPACITY];
        System.arraycopy(coursesArray, 0, tmpCoursesArray, 0, tmpCapacity);
        coursesArray = tmpCoursesArray;
    }

    public Course[] getCoursesArray() {
        return coursesArray;
    }
}