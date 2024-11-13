package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Employee;
import com.example.repository.EmployeeRepository;

/**
 * 従業員の業務処理のクラス
 * 
 * @tatsuki tagaya
 */

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * @param 従業員情報を全件取得する
     * @return employeeList
     */
    public List<Employee> showList() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    /**
     * @param　従業員詳細リストを取得する
     * @return emploee
     */
    public Employee showDatail(Integer id){
       Employee employee = employeeRepository.load(id);
       return employee;

    }

}
