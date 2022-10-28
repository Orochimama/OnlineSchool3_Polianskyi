package com.onlineSchool.service;

import com.onlineSchool.classes.Student;

public class StudentService {
    int courseStudentId;

    public Student creatStudent(int courseStudentId) {
        return new Student(courseStudentId);
    }
}
