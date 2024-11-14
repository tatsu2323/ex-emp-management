package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.domain.Employee;
import com.example.form.UpdateEmployeeForm;
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
       List<Employee> employeeList = employeeService.showList();
       model.addAttribute("employeeList", employeeList);
       return "employee/list";
    }

    /**
     * 
     * @param id
     * @param model
     * @return
     */

    @GetMapping("/showDetail")
    public String showDetail(String id,Model model){
      Employee employee = employeeService.showDatail(Integer.parseInt(id));
      model.addAttribute("employee", employee);
      //System.out.println(employee);employeeの中身確認
      return "employee/detail";    
    }
    /**
     * 
     * @param form
     * @param model
     * @return
     */
    @PostMapping("/update")
    public String update(UpdateEmployeeForm form, Model model){
      System.out.println(form);

      Employee employee = employeeService.showDatail(Integer.parseInt(form.getId()));
      //System.out.println(employee);
      employee.setDepartmentsCount(Integer.parseInt(form.getDepartmentsCount()));
      //System.out.println(employee);
      employeeService.update(employee);
      model.addAttribute("employee", employee);
      return "redirect:/employee/showList";
    }


}
