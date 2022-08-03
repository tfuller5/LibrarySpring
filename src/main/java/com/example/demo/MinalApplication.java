package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

// java: error: invalid source release: 17





@SpringBootApplication
public class MinalApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext app =  SpringApplication.run(MinalApplication.class, args);
		// bean!
		String[] beans = app.getBeanDefinitionNames();

		     String random = beans[0];
		for (String bean   : beans   ) {
			System.out.println("> "+bean);
		}

		Arrays.stream(beans).forEach(p -> System.out.println(p));

	}


	@Bean
	public void do_something() {
		System.out.println("something was done");
	}


}

