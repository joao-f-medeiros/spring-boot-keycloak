package com.keycloak.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AuthServiceApplication {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String password1 = bCryptPasswordEncoder.encode("john123");
		String password2 = bCryptPasswordEncoder.encode("sachin123");

		SpringApplication.run(AuthServiceApplication.class, args);
	}

}
