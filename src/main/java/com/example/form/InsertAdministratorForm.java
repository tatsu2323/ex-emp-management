package com.example.form;

public class InsertAdministratorForm {
    

    /**
     * InsertAddministratorFormの定義
     */
    private String name;
    private String mailAddress; 
    private String password;

    //getter,setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMailAddress() {
        return mailAddress;
    }
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
                + "]";
    }

    //toStringメソッド
    


    
    
}
