package com.example.weeklyTest.controller;

import com.example.weeklyTest.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private Student s1;
    @GetMapping(value = "/student")
    public Student getStudent(){
        return s1;
    }


}
