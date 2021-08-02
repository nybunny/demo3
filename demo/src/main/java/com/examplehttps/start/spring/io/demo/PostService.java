package com.examplehttps.start.spring.io.demo;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPosts()
    {
        return postRepository.findAll();
//        return posts;
    }

    public void addPost(String content, String author)
    {
        Post post = new Post();
        post.setAuthor(author);
        post.setContent(content);
        post.setCreated(Instant.now());
        postRepository.save(post);
        //        posts.add(post);
    }
/*
    public Post getPost(int id) //get one post using id
    {
        return postRepository.find(id);
    }*/
}
