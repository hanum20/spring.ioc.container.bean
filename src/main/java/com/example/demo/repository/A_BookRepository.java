package com.example.demo.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class A_BookRepository implements BookRepository {

    @Override
    public void printInfo() {
        System.out.println("print : A_BookRepository");
    }
}
