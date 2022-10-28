package com.onlineSchool.classes;

public class Student {
    public static int counterStudent = 0;

    public int courseStudentId;

    public Student(int courseStudentId) {
        this.courseStudentId = courseStudentId;
        counterStudent++;
    }
}
