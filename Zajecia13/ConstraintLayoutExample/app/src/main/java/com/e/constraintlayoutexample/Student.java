package com.e.constraintlayoutexample;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "studenci")
public class Student {
    @PrimaryKey
    Long id;
    String name;
    String surname;

    Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
