package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.domain.Administrator;
import com.example.form.InsertAdministratorForm;
import com.example.form.LoginForm;
import com.example.service.AdministratorService;


@Controller
@RequestMapping("/")
public class AdministratorController {
    
    @Autowired
    private AdministratorService administratorService;

    @GetMapping("/toInsert")
    public String toInsert(InsertAdministratorForm form){
        return "administrator/insert";
    }

    @PostMapping("/insert")
    public String insert(InsertAdministratorForm form){
        System.out.println(form);
        Administrator administrator = new Administrator();
        BeanUtils.copyProperties(form, administrator); 
        administratorService.insert(administrator);
        return "redirect:/toinsert/";
    }
   /**
    * ログイン情報画面に遷移する
    * @param form
    * @return
    */
    @GetMapping("/")
    public String toLogin(LoginForm form){
        return "administrator/login";
    }
    
}
