package com.example.form;

/**
 * 従業員情報のドメインクラス
 * @author tatsuki tagaya
 */
public class UpdateEmployeeForm {
     
    /**従業員ID*/
    private String id;

    /**扶養人数 */
    private String departmentsCount;
    
    //getter,setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentsCount() {
        return departmentsCount;
    }

    public void setDepartmentsCount(String departmentsCount) {
        this.departmentsCount = departmentsCount;
    }

     //toString
    @Override
    public String toString() {
        return "UpdateEmployeeForm [id=" + id + ", departmentsCount=" + departmentsCount + "]";
    }
    

    
    

    
}
