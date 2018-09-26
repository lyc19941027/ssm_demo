package com.test.ssm_demo.model;

import java.io.Serializable;

/**
 * @description:
 * @author: yinc.luo
 * @date: 2018-05-29 14:45
 */
public class User implements Serializable {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}
