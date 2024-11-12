package com.example.domain;

import java.util.Date;

/**
 * 従業員を表すクラス
 * 
 * @ tatsuki tagaya
 * 
 */

public class Employee {

    /**id */
    private Integer id;


    /**名前 */
    private String name;


    /**画像 */
    private String image;


    /**性別 */
    private String gender;


    /**入社日 */
    private Date hireDate;

    /** メールアドレス */
    private String mailAddres;


    /**郵便番号 */
    private String zipCode;


    /** 住所 */
    private String address;


   /** 電話番号 */
    private String telephone;


    /**給料 */
    private Integer salary;


    /**特性 */
    private String characterristics;


    /**不要人数 */
    private Integer departmentsCount;

    
    //以下、コンストラクタ
    public Employee() {
    }

    public Employee(Integer id, String name, String image, String gender, Date hireDate, String mailAddres,
            String zipCode, String address, String telephone, Integer salary, String characterristics,
            Integer departmentsCount) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.gender = gender;
        this.hireDate = hireDate;
        this.mailAddres = mailAddres;
        this.zipCode = zipCode;
        this.address = address;
        this.telephone = telephone;
        this.salary = salary;
        this.characterristics = characterristics;
        this.departmentsCount = departmentsCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getMailAddres() {
        return mailAddres;
    }

    public void setMailAddres(String mailAddres) {
        this.mailAddres = mailAddres;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getCharacterristics() {
        return characterristics;
    }

    public void setCharacterristics(String characterristics) {
        this.characterristics = characterristics;
    }

    public Integer getDepartmentsCount() {
        return departmentsCount;
    }

    public void setDepartmentsCount(Integer departmentsCount) {
        this.departmentsCount = departmentsCount;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", image=" + image + ", gender=" + gender + ", hireDate="
                + hireDate + ", mailAddres=" + mailAddres + ", zipCode=" + zipCode + ", address=" + address
                + ", telephone=" + telephone + ", salary=" + salary + ", characterristics=" + characterristics
                + ", departmentsCount=" + departmentsCount + "]";
    }

   

    
    
    
    
}
