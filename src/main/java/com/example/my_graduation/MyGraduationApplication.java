package com.example.my_graduation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MyGraduationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyGraduationApplication.class, args);
    }

}
