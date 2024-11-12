package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.InsertAdministratorForm;
import com.example.service.AdministratorService;

@controller
@RequestMapping("/")
public class AdministratorController {
    
    @Autowirerd
    private AdministratorService administratorService;

    public String toInsert(InsertAdministratorForm form){
        
    }
    
}
