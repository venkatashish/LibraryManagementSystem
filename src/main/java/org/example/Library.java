package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {


    public ArrayList<Books> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(int i){

        System.out.println("Enter title of the book");
        Scanner myObj = new Scanner(System.in);
        String title = myObj.nextLine();
        System.out.println("Enter author of the book");
        String author = myObj.nextLine();
        System.out.println("Enter ISBN of the book");
        int isbn = myObj.nextInt();

        books.add(new Books(title, author, isbn));

    }

    public void retreiveBooks(){
        for(Books element : books){
            System.out.println(element);
            System.out.println("--------NEXT BOOK DETAILS--------");
        }
    }
}
