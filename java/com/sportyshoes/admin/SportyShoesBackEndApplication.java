package com.sportyshoes.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.sportyshoes.common.entity"})
public class SportyShoesBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesBackEndApplication.class, args);
	}

}
