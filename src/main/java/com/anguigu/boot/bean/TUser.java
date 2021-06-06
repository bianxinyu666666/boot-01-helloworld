package com.anguigu.boot.bean;

import lombok.Data;

@Data
public class TUser {
    private String uname;
    private String pwd;
    private String repwd;
    private String flag;
    private String email;
    private String imgpath;
    private String user_telephone;
    private double role;
    private double sex;
}