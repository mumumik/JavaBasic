/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Charles_AM234
 */
public class Book extends Apps{
    private int id,choice;
    private String name, author, publisher;
    ArrayList<Book> albook = new ArrayList<Book>();
    static Scanner idInput = new Scanner(System.in);
    static Scanner nameInput = new Scanner(System.in);
    static Scanner authorInput = new Scanner(System.in);
    static Scanner publisherInput = new Scanner(System.in);
    
    public Book(int id, String name, String author, String publisher){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }
    
    public Book(){
        
    }
    
    @Override
    public void openMenu(){
        do{
            menu();
            switch(choice){
                case 1: 
                    showBooks();
                    break;
                case 2: 
                    addBook();
                    break;
                case 3:
                    deleteAllBook();
                    break;
                case 4: 
                    System.out.println("Back to Apps"); 
                    albook.clear();
                    break;
                default : System.out.println("Please provide number that are in the list"); break;
            }                        
        }while(choice != 4);
    }
    
    @Override
    public void menu(){
        System.out.println("");
        System.out.println("Book Menu : ");
        System.out.println("1. Show books ");
        System.out.println("2. Add Book ");        
        System.out.println("3. Delete All Book ");        
        System.out.println("4. Back ");
        System.out.print("Select Menu : ");
        choice = menuCheck();
    }
    
    public void showBooks(){
        
        for(Book b:albook){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher);
        }
    }
    
    public void addBook(){
        System.out.print("Please enter book id :");
        id = idInput.nextInt();
        System.out.print("Please enter book name :");
        name = nameInput.nextLine();
        System.out.print("Please enter book author :");
        author = authorInput.nextLine();
        System.out.print("Please enter book publisher :");
        publisher = publisherInput.nextLine();
        Book b1 = new Book(id, name,author,publisher);
        albook.add(b1);
    }
    
    public void deleteAllBook(){
        albook.clear();
        System.out.println("Deleted all books");
    }
    
}
