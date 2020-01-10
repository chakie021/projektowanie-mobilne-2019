package com.e.databaseexample;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "studenci")
public class Student {
    @PrimaryKey
    public Integer id;
    public String name;
    public String surname;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

}
