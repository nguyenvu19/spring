package com.nguyenvu.demospringboot.config;

import com.nguyenvu.demospringboot.model.UserModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Thông báo cho spring boot biết khi chạy ở tầng config thì phải quét và cấu hình
@Configuration
public class CustomConfig {

//    Bean giúp khởi tạo một class và đưa về container của Spring
//    Bean là hàm trả về UserModel và đưa về IOC
    @Bean
    public UserModel userModel(){
        UserModel  userModel = new UserModel();
        userModel.setUsername("Vu");
        userModel.setPassword("123");

        return userModel;
    }
}
