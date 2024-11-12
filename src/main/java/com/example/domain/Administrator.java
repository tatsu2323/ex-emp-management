package com.example.domain;

/**
 * 管理者の情報です
 * 
 * @ tatsuki tagaya
 * 
 */
public class Administrator {

    /*id */
    private Integer id;

    /*名前 */
    private String name;
    
    /*メールアドレス */
    private String mailAddres;


    /*パスワード */
    private String password;

   //以下、コンストラクタ
    public Administrator() {

    }

    public Administrator(Integer id, String name, String mailAddres, String password) {
        this.id = id;
        this.name = name;
        this.mailAddres = mailAddres;
        this.password = password;
    }

    //以下,getter setter
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

    public String getMailAddres() {
        return mailAddres;
    }

    public void setMailAddres(String mailAddres) {
        this.mailAddres = mailAddres;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /** To String のオーバーライド */
    @Override
    public String toString() {
        return "Administrator [id=" + id + ", name=" + name + ", mailAddres=" + mailAddres + ", password=" + password
                + "]";
    }

    
    
}
