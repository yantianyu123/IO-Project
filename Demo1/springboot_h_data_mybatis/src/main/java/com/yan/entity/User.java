package com.yan.entity;

import java.io.Serializable;

/**
 * @author 闫天宇
 * @date 2019/7/3-10:12
 */
public class User implements Serializable {
    private Integer id;
    private String userid;
    private String name;
    private String password;
    private String email;
    private String createtime;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCreatetime() {
        return createtime;
    }
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}
