package com.dalong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Consumer;

@RestController
@SpringBootApplication(scanBasePackages ={"${scan.packages}","${scan.thirdpackages}"})
public class AppdemoApplication {
	@Autowired
	List<UserLogin> userLogins ;

	@Value(value = "${scan.packages}")
	private String packages;

	@Value(value = "${scan.thirdpackages:null}")
	private String thirdpackage;

	public static void main(String[] args) {
		SpringApplication.run(AppdemoApplication.class, args);
	}

	@GetMapping(value = {"/demo"})
    public String result(){
		 userLogins.forEach(new Consumer<UserLogin>() {
			 @Override
			 public void accept(UserLogin userLogin) {
				 System.out.println(userLogin.login("dalobg",111));
			 }
		 });
		 return  String.format("%s,%s",packages,thirdpackage);
	}

}
