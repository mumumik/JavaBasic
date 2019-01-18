/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Charles_AM234
 */
class Apps extends AndroidPhone {
  
    private int choice;
    private int age;
    private long bornYear;
    static Scanner yearInput = new Scanner(System.in);
    
    public Apps(){
        
    }
    
    @Override
    public void menu(){
        System.out.println("");
        System.out.println("App Menu : ");
        System.out.println("1. Book App ");
        System.out.println("2. Show today's date/time ");        
        System.out.println("3. Calculate Age ");        
        System.out.println("4. Back ");
        System.out.print("Select Menu : ");
        choice = menuCheck();
    }
    
    @Override
    public void openMenu(){
        do{
            menu();
            switch(choice){
                case 1: 
                    books();
                    break;
                case 2: 
                    showDateTime();
                    break;
                case 3:
                    System.out.print("Please enter your born year : ");
                    calculateAge();
                    break;
                case 4: System.out.println("Back to Menu"); break;
                default : System.out.println("Please provide number that are in the list"); break;
            }                        
        }while(choice != 4);
    }
    
    public void runApp(){
        batteryLevel -= 5;
        System.out.println("The app consuming 5 percent of your battery");
    }
    
    public void showDateTime(){
        batteryLevel -= 5;
        LocalDateTime wib = LocalDateTime.now(ZoneId.of("Asia/Jakarta"));
        LocalDateTime wita = LocalDateTime.now(ZoneId.of("Asia/Makassar"));
        LocalDateTime wit = LocalDateTime.now(ZoneId.of("Asia/Jayapura"));
        System.out.println("Today's Date Time in Jakarta : "+wib);
        System.out.println("Today's Date Time in Bali : "+wita);
        System.out.println("Today's Date Time in Jayapura : "+wit);
    }
    
    public void calculateAge(){
        batteryLevel -= 5;
        try
        {
            bornYear = yearInput.nextLong();
            LocalDate today = LocalDate.now();
            age = (today.minusYears(bornYear)).getYear();
            System.out.println("Your Age is : "+ age + " years old this year.");
        }
        catch(InputMismatchException e)
        {
            userInput.next();
            System.out.println(e.getMessage());
            
        }
    }
    
    public void books(){
        System.out.println("Welcome to book app..");
        Book myBook = new Book();
        myBook.openMenu();
    }
}
