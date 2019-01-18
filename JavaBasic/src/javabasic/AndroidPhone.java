package javabasic;

/**
 *
 * @author Charles_AM234
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AndroidPhone {
    
    public static int batteryLevel; //Instance variable integer
    public static String type; //Instance variable String
    public static String owner; //Instance variable String
    private static int choice; //Instance variable integer
    static Scanner userInput = new Scanner(System.in);
    
    public AndroidPhone(){
        batteryLevel = 100;
    }
    
    //Method that do not return value
    public void checkBatteryLevel(){
        System.out.println("Your " + this.type + " battery level is at : " + batteryLevel + " percent.");
    }
    
    public void chargeBattery(){
        //Loop
        while(batteryLevel<100){
            //Aritmethic Operator
            batteryLevel += 10;
            //If else
            if(batteryLevel >= 100){
                batteryLevel = 100;
            } else{
                System.out.println("Charging . . . ("+batteryLevel+"%)");
            }   
        }
        System.out.println("Your phone is fully charged");
    }
    
    public void menu(){
        System.out.println("");
        System.out.println("Android Phone || Welcome..");
        System.out.println("Battery : "+ batteryLevel +" percent.");
        System.out.println("Menu : ");
        System.out.println("1. Configuration ");
        System.out.println("2. Applications ");
        System.out.println("3. Charge ");
        System.out.println("4. Turn Off ");
        System.out.print("Select Menu : ");
        choice = menuCheck();
    }
    
    public int menuCheck(){
        try
        {
            return userInput.nextInt();
        }
        catch(InputMismatchException e)
        {
            userInput.next();
            return 0;
        }
    }
    
    public void openMenu(){
    
    }
    
    
    
    public static void main(String[] args) {
        AndroidPhone myPhone = new AndroidPhone();
        Configuration myConfig = new Configuration(); //Object declaration
        Apps myApps = new Apps();
        myConfig.setPhonetype("Samsung Galaxy J7 Prime"); //Accessing instance method
        do{
            myPhone.menu();
            switch(choice){
                case 1: 
                    myConfig.openMenu();
                    break;
                case 2: 
                    myApps.openMenu();
                    break;
                case 3: 
                    myPhone.chargeBattery();
                    break;
                case 4: System.out.println("Turning Off..."); break;
                default : System.out.println("Please provide number that are in the list"); break;
            }            
        }while(choice != 4);        
        
    }
    
}
