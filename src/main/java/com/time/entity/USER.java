package com.time.entity;

import java.util.Date;

//create table USER(
//        ID Int NOT NULL AUTO_INCREMENT,
//        name VARCHAR(32)  NOT NULL UNIQUE,
//        pwd  VARCHAR(32)  NOT NULL,
//        sex  INT(1),
//        telephone VARCHAR(32),
//        email VARCHAR(32),
//        birthday DATE,
//        dept_code VARCHAR(32),
//        time DATE,
//        PRIMARY key (ID)
//        )ENGINE=InnoDB DEFAULT CHARSET=utf8;

public class USER {
    private int ID;
    private String name;
    private String pwd;
    private Byte sex;
    private String telephone;
    private String email;
    private Date birthday;
    private String dept_code;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    private Date  time;
}
