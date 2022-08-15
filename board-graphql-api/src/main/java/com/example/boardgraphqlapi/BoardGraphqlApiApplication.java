package com.example.boardgraphqlapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static utils.StringUtils.testLibrary;

@SpringBootApplication
public class BoardGraphqlApiApplication {

    public static void main(String[] args) {
        testLibrary();
        SpringApplication.run(BoardGraphqlApiApplication.class, args);
    }

}
