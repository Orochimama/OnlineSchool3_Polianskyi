

package com.onlineSchool.classes;

public class Lecture {
    public static int counterLecture = 0;
    public int courseLectureId;


    private Homework homework;
    private AdditionalMaterials additionelMaterials;

    public Lecture(int courseLectureId) {
        this.courseLectureId = courseLectureId;
        counterLecture++;
    }
}
