package org.example;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        System.out.println("How many books do you want to add?");
        Scanner obj = new Scanner(System.in);
        int noOfBooks = obj.nextInt();
        Library l1 = new Library();

        for(int i=0;i<noOfBooks;i++){
            l1.addBook(i);
        }

        l1.retreiveBooks();
        obj.close();
    }
}
