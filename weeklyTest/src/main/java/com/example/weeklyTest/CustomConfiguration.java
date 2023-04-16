package com.example.weeklyTest;

import com.example.weeklyTest.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {
    @Bean
    public Student getStudent(){
        System.out.println("Configuration class are calling and given student object");
        return new Student("Neeraj");
    }
}
