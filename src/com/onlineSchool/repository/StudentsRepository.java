package com.onlineSchool.repository;

import com.onlineSchool.classes.Student;

public class StudentsRepository {
    private int CAPACITY = 10;
    private Student[] studentsArray = new Student[CAPACITY];

    public void addStudent(Student student) {
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null) {
                studentsArray[i] = student;
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
        Student[] tmpStudentsArray = new Student[CAPACITY];
        System.arraycopy(studentsArray, 0, tmpStudentsArray, 0, tmpCapacity);
        studentsArray = tmpStudentsArray;
    }

    public Student[] getStudentsArray() {
        return studentsArray;
    }
}
