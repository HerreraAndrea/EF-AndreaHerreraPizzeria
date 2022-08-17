package com.idat.edu.pe.herrera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EfAndreaHerreraPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfAndreaHerreraPizzeriaApplication.class, args);
	}

}
