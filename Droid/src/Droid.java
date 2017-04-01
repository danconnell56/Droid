/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Connell 277
 */ 
import java.util.Scanner;
public class Droid extends NewClass{
int batteryLevel =100;
Scanner inputa = new Scanner (System.in);
    public int i;
 
  public void activate(){
 System.out.println("Activated. Yes, I am the droid you were looking for. How can I help you?");
 System.out.println("Press 1 to charge my battery,");
 System.out.println( "press 2 to check my battery level,");
 System.out.println("press 3 if you wish me to hover.");
 System.out.println("press 4 if you want me to zap some battle droids");
  System.out.println("press 5 if you just want me to pour you a drink.");
 batteryLevel= batteryLevel-5;
    
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }
  
  public void chargeBattery(int hours){
 inputa.nextInt();
 batteryLevel= batteryLevel+hours;
    {System.out.println("Battery level will be: " + batteryLevel + " percent in "+ hours+ " hours in the mean time");
    System.out.println("I hope you don't need my map to find someone.... I'll just be");
    System.out.println("over here charging all alone...");
    }     }
  
  public void checkBatteryLevel()
  {System.out.println("Really? You finnaly found the droid you were");
   System.out.println("looking for and you wanna check my battery??");
   System.out.println("Why not make me hover or find a new hope");
  System.out.println("or something fun?");
   System.out.println("O well, Battery level is: " + batteryLevel + " percent.");}
  
  public void hover(int feet){
  
        System.out.println("How many feet off the ground should I hover?");
      
    if (inputa.nextInt()>2){System.out.println("Error! I cannot hover above 2 feet.");
               }//if
    else {System.out.println("Hovering....");
         batteryLevel=batteryLevel-20;
         System.out.println("Battery level will be: " + batteryLevel + " percent.");
         }//else
  }//hover
    public void taze (int battleDroids){
        System.out.println("Good choice!!!");
        System.out.println("How many Battle Droids should");
        System.out.println("I shock?");
        
         if (inputa.nextInt()<=4){System.out.println("That's it? C'mon I wanna");
         System.out.println("get more than that try again.");
         }
         else {System.out.println("Alright time to play!!");
      batteryLevel=batteryLevel-2;
         }
    }
  
  
  
  
  
  
  
  
  
  
  
 
    public static void main(String[] args) {
         
     Droid newDroid = new Droid();
  
     newDroid.activate();
Scanner inputa= new Scanner (System.in);


      switch (inputa.nextInt()){
          case 1:    
              System.out.println("How many hours should I charge?");
              newDroid.chargeBattery(1);
          break;
      case 2:
            newDroid.checkBatteryLevel();
        break;
        case 3:
            newDroid.hover(0);
        break;
        case 4:
            newDroid.taze(0);
            break;
               case 5 :
                   System.out.println("What would like to drink?");
            NewClass.fun();
            break;
            
         default: System.out.println("Hey its a super advanced astro droid, lets just push buttons!!");
        System.out.println("Presss 1, 2, 3, 4 or 5");
                }
      
      
      
      switch (inputa.nextInt()){
          case 1:    
              System.out.println("How many hours should I charge?");
              newDroid.chargeBattery(1);
          break;
      case 2:
            newDroid.checkBatteryLevel();
        break;
        case 3:
            newDroid.hover(0);
        break;
        case 4:
            newDroid.taze(0);
            break;
        case 5 :
                   System.out.println("What would like to drink?");
            NewClass.fun();
            break;
             
        default: System.out.println("Hey its a super advanced astro droid, lets just push buttons!!");
        System.out.println("Presss 1, 2, 3, 4 or 5");
    }
    }
}
