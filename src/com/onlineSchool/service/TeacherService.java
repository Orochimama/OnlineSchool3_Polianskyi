package com.onlineSchool.service;

import com.onlineSchool.classes.Teacher;

public class TeacherService {
    int courseTeacherId;

    public Teacher creatTeacher(int courseTeacherId) {
        return new Teacher(courseTeacherId);
    }
}
