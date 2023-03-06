package com.learnspring.enterprise.controller;

import com.learnspring.enterprise.service.BusinessLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller1 {
//    @Autowired
    private BusinessLogic businessLogic;
    @Autowired
    public Controller1(BusinessLogic businessLogic){
        System.out.println("constructor dependency injection works");
        this.businessLogic =businessLogic;
    }
    public int getResult(){
      return businessLogic.formattedData();
    }
}
