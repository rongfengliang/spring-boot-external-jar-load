package com.mydalong;

import com.dalong.UserLogin;
import org.springframework.stereotype.Service;

@Service
public class MyDalong implements UserLogin {
    @Override
    public String login(String name, int age) {
        return "MyDalong";
    }
}
