package com.onlineSchool.repository;

import com.onlineSchool.classes.Teacher;

public class TeacherRepository {
    private int CAPACITY = 10;
    private Teacher[] teachersArray = new Teacher[CAPACITY];

    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < teachersArray.length; i++) {
            if (teachersArray[i] == null) {
                teachersArray[i] = teacher;
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
        Teacher[] tmpTeachersArray = new Teacher[CAPACITY];
        System.arraycopy(teachersArray, 0, tmpTeachersArray, 0, tmpCapacity);
        teachersArray = tmpTeachersArray;
    }

    public Teacher[] getTeachersArray() {
        return teachersArray;
    }
}
