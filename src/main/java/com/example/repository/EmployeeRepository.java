package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Employee;

@Repository
public class EmployeeRepository {

    @Autowired
    private NamedParameterJdbcTemplate template;

    // Integer id, String name, String image, String gender, Date hire_date, String mailAddres,
    //         String zipCode, String address, String telephone, Integer salary, String characterristics,
    //         Integer deparmentsCount

    private static final RowMapper<Employee> EMPLOYEE_ROW_MAPPER = (rs, i) -> {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setImage(rs.getString("image"));
        employee.setGender(rs.getString("gender"));
        employee.setHireDate(rs.getDate("hire_date"));
        employee.setMailAddres(rs.getString("mail_address"));
        employee.setZipCode(rs.getString("zip_code"));
        employee.setAddress(rs.getString("address"));
        employee.setTelephone(rs.getString("telephone"));
        employee.setSalary(rs.getInt("salary"));
        employee.setCharacterristics(rs.getString("characteristics"));
        employee.setDepartmentsCount(rs.getInt("dependents_count"));
        return employee;
    };

    /**
     * 
     * 管理者情報を挿入する
     * 
     */

    public void save(Employee employee) {

        SqlParameterSource param = new BeanPropertySqlParameterSource(employee);

        if (employee.getId() == null) {
            String sqlInsert = "INSERT INTO employees(name, image, gender, hire_date, mail_address,"
                                + " zip_code, address, telephone, salary, characteristics,dependents_count)"
                                + " VALUES (:name, :image, :gender, :hireDate, :mailAddres, :zipCode, :address, :telephone, :salary, :characterristics,:departmentsCount)";

            template.update(sqlInsert, param);

        } else {
            String upDateSql = "UPDATE employees SET name=:name, image=:image, gender=:gender, hire_date=:hireDate, mail_address=:mailAddres, zip_code=:zipCode, address=:Address, telephone=:telephone, salary=:salary, characteristics=:characterristics,dependents_count=:departmentsCount "
                               + " WHERE id =:id";
            template.update(upDateSql, param);
        }

    }

    /**
     * 全権検索をする
     */

    public List<Employee> findAll() {
        String findAllSql = "SELECT id, name, image, gender, hire_date, mail_address, zip_code, address, telephone, salary, characteristics,dependents_count FROM employees ORDER BY hire_date DESC";
        List<Employee> employeeList = template.query(findAllSql,EMPLOYEE_ROW_MAPPER);
        if (employeeList.size() == 0) {
            return null;
        }
        return employeeList;

    }

    /**
     * 主キー検索
     */

     public Employee load(Integer id){
        String loadSql ="SELECT id, name, image, gender, hire_date, mail_address, zip_code, address, telephone, salary, characteristics,dependents_count FROM employees WHERE id =:id";
        SqlParameterSource param = new MapSqlParameterSource().addValue("id",id);
        Employee employee = template.queryForObject(loadSql,param,EMPLOYEE_ROW_MAPPER);
        return employee;

     }
    
}
