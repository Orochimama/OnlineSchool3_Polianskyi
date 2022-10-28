package com.onlineSchool.service;

import com.onlineSchool.classes.Lecture;

public class LectureService {
    int courseLectureId;

    public Lecture creatLecture(int courseLectureId) {
        return new Lecture(courseLectureId);


    }
}
