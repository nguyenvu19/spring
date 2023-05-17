package com.nguyenvu.demospringboot.controller;

import com.nguyenvu.demospringboot.model.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @GetMapping()
    public String login() {
        return "login";
    }

//    Tham số truyền trên trình duyệt(Get) và tham số truyền ngầm(Post,Put,Delete,...)
//    RequestParam: Quy định tham số nhỏ lẻ
//    RequestBody: Tham số sẽ là 1 JSON ( đối tượng )
    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestParam String username, @RequestParam String password) {
        return new ResponseEntity<>("Hello" + username + password, HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody UserModel model){

        return new ResponseEntity<>(""+model.getUsername(),HttpStatus.OK);
    }
}
