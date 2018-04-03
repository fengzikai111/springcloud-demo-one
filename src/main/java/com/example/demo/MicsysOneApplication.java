package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicsysOneApplication {

	public static void main(String[] args) {
		System.out.println("this is first demo about micsys");
		SpringApplication.run(MicsysOneApplication.class, args);
		System.out.println(Integer.getInteger("hello.int"));
	}
}
