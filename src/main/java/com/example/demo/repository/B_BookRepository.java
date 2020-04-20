package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class B_BookRepository implements BookRepository{
    @Override
    public void printInfo() {
        System.out.println("print : B_BookRepository");
    }
}
