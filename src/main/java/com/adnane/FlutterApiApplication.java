package com.adnane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class FlutterApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlutterApiApplication.class, args);
	}

}
