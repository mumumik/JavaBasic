/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

//import java.util.Scanner;

/**
 *
 * @author Charles_AM234
 */
class Apps extends AndroidPhone {
  
    private int choice;
    
    public Apps(){
        
    }
    
    @Override
    public void menu(){
        System.out.println("App Menu : ");
        System.out.println("1. Run App ");
        System.out.println("2. Back ");        
        System.out.print("Select Menu : ");
        choice = menuCheck();
    }
    
    @Override
    public void openMenu(){
        do{
            menu();
            switch(choice){
                case 1: 
                    runApp();
                    break;
                case 2: System.out.println("Back to Menu"); break;
                default : System.out.println("Please provide number that are in the list"); break;
            }                        
        }while(choice != 2);
    }
    
    public void runApp(){
        batteryLevel -= 5;
        System.out.println("The app consuming 5 percent of your battery");
    }
}
