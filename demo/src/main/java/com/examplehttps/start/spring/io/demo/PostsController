package com.examplehttps.start.spring.io.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {

    private final PostService postService;

    public PostsController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/posts")
    public void createPost(@RequestBody Post post){
        postService.addPost(post);
    }

    @GetMapping("/posts")
    public List<Post> readPosts(){
        return postService.getPosts();
    }

}