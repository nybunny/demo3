package com.examplehttps.start.spring.io.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
        //find...
    //public Post find(Integer integer); //void 말고는 아무것도 안 되나?
        //insert...
    //public void insert(Post post);

    //hql=>sql
}
