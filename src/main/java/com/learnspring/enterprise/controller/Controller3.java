package com.learnspring.enterprise.controller;

import com.learnspring.enterprise.Course;
import com.learnspring.enterprise.model.CurrencyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller3 {

    @Autowired
    CurrencyConfig config;
    @RequestMapping("/currency-config")
    public CurrencyConfig CurrencyDetail(){
        return config;
    }
}
