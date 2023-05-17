package com.nguyenvu.demospringboot.model;

import java.util.List;

public class UserModel {
    private String username;
    private String password;
    private List<RoleModel> listRole;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleModel> getListRole() {
        return listRole;
    }

    public void setListRole(List<RoleModel> listRole) {
        this.listRole = listRole;
    }
}
