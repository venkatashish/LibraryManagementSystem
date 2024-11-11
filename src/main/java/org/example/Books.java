package org.example;

public class Books {
    private String title;
    private String author;
    private int isbn;

    public Books(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getIsbn(){
        return this.isbn;
    }


    @Override
    public String toString(){
        return "Author is:- "+author+" Title is:- "+title+" ISBN is:- "+isbn;
    }
}
