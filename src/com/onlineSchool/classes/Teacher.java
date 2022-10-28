package com.onlineSchool.classes;

public class Teacher {
    public static int counterTeacher = 0;

    public int courseTeacherId;

    public Teacher(int courseTeacherId) {
        this.courseTeacherId = courseTeacherId;
        counterTeacher++;
    }
}
