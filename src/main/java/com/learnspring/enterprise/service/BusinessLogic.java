package com.learnspring.enterprise.service;

import com.learnspring.enterprise.model.ProjectData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessLogic {

    @Autowired
    private ProjectData projectData;
    public int formattedData(){
        return(projectData.value+1);
    }

}
