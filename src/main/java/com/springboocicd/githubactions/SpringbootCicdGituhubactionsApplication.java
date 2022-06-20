package com.springboocicd.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCicdGituhubactionsApplication {
	
	@GetMapping("/welcome")
	public String getMessage() {
		return "welcome to cicd class";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootCicdGituhubactionsApplication.class, args);
	}

}
