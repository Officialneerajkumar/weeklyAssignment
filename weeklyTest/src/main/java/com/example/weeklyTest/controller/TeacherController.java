package com.example.weeklyTest.controller;


import com.example.weeklyTest.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    Teacher t1;
    @GetMapping(value = "teach")
    public String teach(){
        return t1.teach();
    }
}
