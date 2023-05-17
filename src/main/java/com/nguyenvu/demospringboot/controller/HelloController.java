package com.nguyenvu.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    //    @RequestParam: Sẽ lấy tham số cho phương thức GET, POST
    @GetMapping("")
//    public String hello(@RequestParam("soA") int so1, @RequestParam int soB){
    public String hello(@RequestParam int soA, @RequestParam int soB) {
        return "hello " + (soA + soB);
    }
}
