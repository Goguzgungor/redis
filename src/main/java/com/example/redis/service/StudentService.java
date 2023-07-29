package com.example.redis.service;


import com.example.redis.entity.StudentEntity;
import com.example.redis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(@Qualifier("studentRepository") StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(StudentEntity studentEntity) {
        studentRepository.save(studentEntity);
    }

    public StudentEntity getStudent(String id) {
        return studentRepository.findById(id).get();
    }

}
