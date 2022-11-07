package com.onlineSchool.repository;

import com.onlineSchool.classes.AdditionalMaterials;
import com.onlineSchool.classes.Student;

public class AdditionalMaterialsRepositiry {
    private int CAPACITY = 10;
    private AdditionalMaterials[] additionalMaterialsArray = new AdditionalMaterials[CAPACITY];

    public void addTeacher(AdditionalMaterials additionalMaterials) {
        for (int i = 0; i < additionalMaterialsArray.length; i++) {
            if (additionalMaterialsArray[i] == null) {
                additionalMaterialsArray[i] = additionalMaterials;
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
        AdditionalMaterials[] tmpAdditionalMaterialsArray = new AdditionalMaterials[CAPACITY];
        System.arraycopy(additionalMaterialsArray, 0, tmpAdditionalMaterialsArray, 0, tmpCapacity);
        additionalMaterialsArray = tmpAdditionalMaterialsArray;
    }

    public AdditionalMaterials[] getAdditionalMaterialsArray() {
        return additionalMaterialsArray;
    }
}