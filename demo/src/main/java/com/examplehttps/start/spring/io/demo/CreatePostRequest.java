package com.examplehttps.start.spring.io.demo;

import lombok.Data;

@Data
public class CreatePostRequest {
    private String content;

    private String author;
}
