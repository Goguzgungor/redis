package com.example.redis.entity;

import com.example.redis.enums.Gender;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("StudentEntity")
public class StudentEntity implements Serializable {



    private String id;

    public StudentEntity(String id, String name, Gender gender, int grade) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    private String name;
    private Gender gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private int grade;
    // ...
}
