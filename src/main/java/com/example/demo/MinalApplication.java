package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MinalApplication {
	public static void main(String[] args) {

		SpringApplication.run(MinalApplication.class, args);

		for (int i =0; i<100; i++) {
			System.out.println("code");
		}
	}



}

