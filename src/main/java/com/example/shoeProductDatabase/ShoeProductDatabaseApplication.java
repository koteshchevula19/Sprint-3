package com.example.shoeProductDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoeProductDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoeProductDatabaseApplication.class, args);
		System.out.println("connected");
	}

}
