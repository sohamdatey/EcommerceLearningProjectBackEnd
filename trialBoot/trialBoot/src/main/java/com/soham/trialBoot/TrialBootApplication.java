package com.soham.trialBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.soham.trialBoot.mapper")
public class TrialBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrialBootApplication.class, args);
	}

}
