package com.example.my_graduation.model;

public class User {
    private int u_id;
    private String u_tel;
    private String u_name;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    private String u_openid;
    private String u_email;
    private String u_password;
    private String u_sex;
    private String u_institutions;
    private String u_area;

    public User() {
    }

    public String getU_tel() {
        return u_tel;
    }

    public void setU_tel(String u_tel) {
        this.u_tel = u_tel;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_openid() {
        return u_openid;
    }

    public void setU_openid(String u_openid) {
        this.u_openid = u_openid;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public String getU_institutions() {
        return u_institutions;
    }

    public void setU_institutions(String u_institutions) {
        this.u_institutions = u_institutions;
    }

    public String getU_area() {
        return u_area;
    }

    public void setU_area(String u_area) {
        this.u_area = u_area;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_tel='" + u_tel + '\'' +
                ", u_name='" + u_name + '\'' +
                ", u_openid='" + u_openid + '\'' +
                ", u_email='" + u_email + '\'' +
                ", u_password='" + u_password + '\'' +
                ", u_sex='" + u_sex + '\'' +
                ", u_institutions='" + u_institutions + '\'' +
                ", u_area='" + u_area + '\'' +
                '}';
    }
}
