package com.habeebcycle.springbootmongodb.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Author")
public class Author {
    
    @Id
    private String id;
    private String name;
    private int age;

    //@DBRef
    private List<Book> books;

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public List<Book> getBooks(){
        return this.books;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setBooks(List<Book> books){
        this.books = books;
    }

}