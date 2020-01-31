package com.habeebcycle.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {
    
    @Id
    private String id;
    private String name;
    private int pages;
    private String genre;
    private String isbn;
    private String year;

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getPages(){
        return this.pages;
    }

    public String getGenre(){
        return this.genre;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public String getYear(){
        return this.year;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setYear(String year){
        this.year = year;
    }
}