package com.example.image_auth_fk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ImageAuthFkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageAuthFkApplication.class, args);
    }

    @GetMapping
    public String hello(){
        return "Hello World";
    }
}
