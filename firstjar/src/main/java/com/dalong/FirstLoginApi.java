package com.dalong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstLoginApi {
    @GetMapping(value = {"/first"})
    public  String demo(){
        return "first";
    }
}
