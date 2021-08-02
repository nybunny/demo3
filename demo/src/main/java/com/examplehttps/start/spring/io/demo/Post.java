package com.examplehttps.start.spring.io.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;
import java.util.Date;

@Entity
@Data

public class Post {


    private String content;



    private String author;


    private Instant created;

    @Id
    private int id;


}
