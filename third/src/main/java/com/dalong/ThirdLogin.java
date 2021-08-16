package com.dalong;

import org.springframework.stereotype.Service;

@Service
public class ThirdLogin implements  UserLogin{
    @Override
    public String login(String name, int age) {
        return "third";
    }
}
