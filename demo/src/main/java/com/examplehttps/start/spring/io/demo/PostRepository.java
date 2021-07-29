package com.examplehttps.start.spring.io.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
        //find...
    public Post find(Integer integer);
        //insert...
    //public void insert(Post post);
}
