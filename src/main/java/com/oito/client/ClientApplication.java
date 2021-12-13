package com.oito.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
@EnableAsync
public class ClientApplication extends SpringBootServletInitializer {

	public static void main(final String[] args) {
		System.out.println("working !!!");
		SpringApplication.run(ClientApplication.class, args);
	}

}
