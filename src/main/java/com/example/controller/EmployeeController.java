package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.domain.Employee;
import com.example.service.EmployeeService;

/**
 * 従業員コントロールクラス
 * @tatsuki-tagaya
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    
    /**
     * 
     * @param model
     * @return
     */
    @RequestMapping("/showList")
    public String showList(Model model){
       List<Employee> employeeList =employeeService.showList();
       model.addAttribute("employeeList", employeeList);
       return "employee/list";
    }
}
