package com.onlineSchool.repository;

import com.onlineSchool.classes.Lecture;
import com.onlineSchool.classes.Student;

public class LectureRepository {
    private int CAPACITY = 10;
    private Lecture[] lecturesArray = new Lecture[CAPACITY];

    public void addLecture(Lecture lecture) {
        for (int i = 0; i < lecturesArray.length; i++) {
            if (lecturesArray[i] == null) {
                lecturesArray[i] = lecture;
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
        Lecture[] tmpLecturesArray = new Lecture[CAPACITY];
        System.arraycopy(lecturesArray, 0, tmpLecturesArray, 0, tmpCapacity);
        lecturesArray = tmpLecturesArray;
    }

    public Lecture[] getLecturesArray() {
        return lecturesArray;
    }
}