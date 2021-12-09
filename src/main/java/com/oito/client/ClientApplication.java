package com.oito.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		System.out.println("working !!!");
		SpringApplication.run(ClientApplication.class, args);
	}

}
