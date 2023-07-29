package com.example.redis.controller;
import com.example.redis.entity.StudentEntity;
import com.example.redis.enums.Gender;
import org.springframework.scheduling.annotation.Async;
import com.example.redis.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/save")
    @Async
    public String saveStudent() {
        StudentEntity studentEntity = new StudentEntity("one","oguz", Gender.MALE,1);
        StudentEntity studentEntity1 = new StudentEntity("a","ali", Gender.MALE,2);
        studentService.saveStudent(studentEntity);
        studentService.saveStudent(studentEntity1);
        return "saved";
    }

    @GetMapping("/get")
    public StudentEntity getStudent() {
        StudentEntity studentEntity = studentService.getStudent("one");
        System.out.println(studentEntity);
        return studentEntity;
    }



}
