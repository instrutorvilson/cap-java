package com.aulas.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsLocacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsLocacaoApplication.class, args);
	}

}
