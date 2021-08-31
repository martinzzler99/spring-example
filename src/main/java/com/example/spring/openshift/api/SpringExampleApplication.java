package com.example.spring.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringExampleApplication {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "hi " +input+" Your application depoloyed successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}

}
