package com.learnspring.enterprise.controller;

import com.learnspring.enterprise.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller2 {
@RequestMapping("/courses")
    public List<Object> courseList(){
        return Arrays.asList(new Course(1,"java","author1"),new Course(2,"python","author2"));
    }
}
