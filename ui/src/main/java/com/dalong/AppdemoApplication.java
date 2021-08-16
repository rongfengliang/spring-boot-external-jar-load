package com.dalong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Consumer;

@RestController
@SpringBootApplication
public class AppdemoApplication {

	@Autowired
	List<UserLogin> userLogins ;
	public static void main(String[] args) {
		SpringApplication.run(AppdemoApplication.class, args);
	}

	@GetMapping(value = {"/demo"})
    public void result(){
		 userLogins.forEach(new Consumer<UserLogin>() {
			 @Override
			 public void accept(UserLogin userLogin) {
				 System.out.println(userLogin.login("dalobg",111));
			 }
		 });
	}

}
