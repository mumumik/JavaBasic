/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Charles_AM234
 */
class Configuration extends AndroidPhone {
    
    static Scanner ownerInput = new Scanner(System.in);
    private int choice;
    //Constructor
    public Configuration(){
       
    }
    
    //Method that return String value
    public void setPhonetype(String phoneType){
        type = phoneType;
    }
    
    public void setOwner(){
        try
        {
            owner = ownerInput.nextLine();
        }
        catch(InputMismatchException e)
        {
            e.getMessage();
        }
    }
    
    //Method that does not return value
    public void checkPhoneType(){
        System.out.println("Your phone type is : " +type);
    }
    public void checkPhoneOwner(){
        System.out.println("This phone is belong to : " +owner);
    }
    
    @Override
    public void menu(){
        System.out.println("");
        System.out.println("Configuration Menu : ");
        System.out.println("1. Set Owner ");
        System.out.println("2. Check phone type ");        
        System.out.println("3. Check phone owner ");        
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
                    System.out.print("Owner Phone Name : ");
                    setOwner();
                    break;
                case 2: 
                    checkPhoneType();
                    break;
                case 3: 
                    checkPhoneOwner();
                    break;
                case 4: System.out.println("Back to Menu"); break;
                default : System.out.println("Please provide number that are in the list"); break;
            }                        
        }while(choice != 4);
    }
    
}
