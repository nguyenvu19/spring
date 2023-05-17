package com.nguyenvu.demospringboot.controller;

import com.nguyenvu.demospringboot.model.RoleModel;
import com.nguyenvu.demospringboot.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserModel userModel;

    @GetMapping("")
    public ResponseEntity<?> getUser(){
        List<RoleModel> list = new ArrayList<>();
        RoleModel roleModel = new RoleModel();
        roleModel.setId(1);
        roleModel.setTen("admin");

        RoleModel roleModel1 = new RoleModel();
        roleModel1.setId(2);
        roleModel1.setTen("user");

        list.add(roleModel);
        list.add(roleModel1);
        userModel.setListRole(list);

        return new ResponseEntity<>(userModel, HttpStatus.OK);
    }
}
