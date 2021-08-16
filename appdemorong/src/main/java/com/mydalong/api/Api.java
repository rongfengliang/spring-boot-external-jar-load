package com.mydalong.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @GetMapping(value = {"/demoapp"})
    public  String demoapp(){
        return  "Mydalong";
    }
}
