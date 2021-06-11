package com.qcl.moudle1;

import com.qcl.moudle2.Service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qcl on 2019-07-23
 * 微信：2501902696
 * desc:
 */
@RestController
public class Controller {

    @Autowired
    private Service1 service;


    @GetMapping("/hello1")
    public String hello1(){
        return service.result();
    }
}