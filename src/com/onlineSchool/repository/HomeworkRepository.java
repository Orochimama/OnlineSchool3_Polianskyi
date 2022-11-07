package com.onlineSchool.repository;

import com.onlineSchool.classes.Homework;
import com.onlineSchool.classes.Student;

public class HomeworkRepository {
    private int CAPACITY = 10;
    private Homework[] homeworksArray = new Homework[CAPACITY];

    public void addHomework(Homework homework) {
        for (int i = 0; i < homeworksArray.length; i++) {
            if (homeworksArray[i] == null) {
                homeworksArray[i] = homework;
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
        Homework[] tmpHomeworksArray = new Homework[CAPACITY];
        System.arraycopy(homeworksArray, 0, tmpHomeworksArray, 0, tmpCapacity);
        homeworksArray = tmpHomeworksArray;
    }

    public Homework[] getHomeworksArray() {
        return homeworksArray;
    }
}