package com.examplehttps.start.spring.io.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	private int i = 1;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//SpringApplication application = new SpringApplication(DemoApplication.class);
		//application.run(args);
		System.out.println("hello world");
		Post post = new Post();
		//System.out.println(postsController.readPosts());
		System.out.println("fffffff");
	}

}
