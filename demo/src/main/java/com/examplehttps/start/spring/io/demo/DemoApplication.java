package com.examplehttps.start.spring.io.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.examplehttps.start.spring.io.demo")
public class DemoApplication {

	//private int i = 1;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//SpringApplication application = new SpringApplication(DemoApplication.class);
		//application.run(args);
		System.out.println("hello world");
		//System.out.println(postsController.readPosts());
		System.out.println("done");
	}

}
