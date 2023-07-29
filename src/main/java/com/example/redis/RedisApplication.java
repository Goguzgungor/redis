package com.example.redis;

import com.example.redis.entity.StudentEntity;
import com.example.redis.enums.Gender;
import com.example.redis.repository.StudentRepository;
import com.example.redis.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

}
