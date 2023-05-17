package com.nguyenvu.demospringboot.controller;

import com.nguyenvu.demospringboot.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
    Annotation: @
    @Controller: Thông báo cho spring boot biết class
    dùng để định nghĩa đường dẫn có trả ra giao diện
    @Restbody: chỉ trả text

    @RestController: Định nghĩa đường dẫn chỉ trả ra text

 */
@RestController
@RequestMapping("/hello")
public class HelloController {

//    Lấy class trên IOC xuống sử dụng
//    Autowired: Gọi class(Bean) đã được khởi tạo trên container
    @Autowired
//    @Qualifier("ten_bean"): lấy class có tên bean được chỉ định trên IOC
    UserModel userModel;

    @GetMapping("")
    public ResponseEntity<?> hello(){
        List<UserModel> list = new ArrayList<>();
        list.add(userModel);
        list.add(userModel);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    //    @RequestParam: Sẽ lấy tham số cho phương thức GET, POST
    @GetMapping("/loichao")
//    public String hello(@RequestParam("soA") int so1, @RequestParam int soB){
    public String hello(@RequestParam int soA, @RequestParam int soB) {
        return "hello " + (soA + soB);
    }
}
