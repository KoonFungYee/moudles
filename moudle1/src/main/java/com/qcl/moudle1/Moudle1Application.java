package com.qcl.moudle1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.qcl"})
public class Moudle1Application {

    public static void main(String[] args) {
        SpringApplication.run(Moudle1Application.class, args);
    }

}