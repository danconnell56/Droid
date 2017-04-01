
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Connell 277
 */    import java.util.Scanner;
public class NewClass {
 

/**
 *
 * @author Connell 277
 */
 

    int change;
    
        public static void fun( ){
        System.out.println("Menu");
        System.out.println("Type 1 for Buffalo Trace- $5");
        System.out.println("Type 2 for Four Roses Small Batch- $7");
        System.out.println("Type 3 for W L Weller- $4");
        System.out.println("Type 4 for Town Branch- $8");
        System.out.println("Type 5 for Basil Hayden- $9");
        System.out.println("Type 6 for Virgil Kaine Rye- $5");
        System.out.println("Type 7 for Vat 69- $9");
        System.out.println("Type 8 for Town Branch Single Barrel - $10");
        System.out.println("Type 9 for Sailor Jerry- $4");
        System.out.println("Type 10 for Blantons- $10");
        
        Scanner input = new Scanner(System.in);
        int menuChoice;
        int quantity = 0;
        int price;
        int total;
        int payment;
        int change;
          
        menuChoice = input.nextInt();
        System.out.println("How many would you like?");
        quantity = input.nextInt();
        
        switch (menuChoice){
        
        case 1:
            System.out.println("You chose Buffalo Chase - $5");
            price = 5;
            break;
        case 2:
             System.out.println("You chose Four Roses Small Batch- $7");
            price = 7;
            break;
        case 3:
             System.out.println("You chose W L Weller - $4");
             price = 4;
             break;
        case 4:
             System.out.println("You chose Town Branch- $8");
            price = 4;
            break;
        case 5:
             System.out.println("You chose Basil Hayden- $9");
             price = 9;
             break;
         case 6:
             System.out.println("You chose Virgil Kaine Rye- $5");
             price = 5;
             break;
         case 7:
             System.out.println("You chose Vat 69- $9");
             price = 9;
             break;
        case 8:
             System.out.println("You chose wisely. Town Branch Single Barrel ");
             System.out.println("is bottled at cask strength at 126 proof.");
             System.out.println("It packs an unusualy pleasent wallop.");
             System.out.println("It is only $10 a glass.");
             price = 10;
             break;
        case 9:
             System.out.println("You chose Sailor Jerry- $4");
             price = 4;
             break;
        case 10:
             System.out.println("You chose Blantons- $10");
          
             price = 10;
             break;
             default: 
             System.out.println ("If you can not pick one of the options I presented ");
            System.out.println("then you are out of luck, that is all i have to offer");
            price = 0;
        }
        
        total = price * quantity;
        System.out.println("Your total is $" + total);
        
          System.out.println("How many dollars will you be paying with? I need to know so I can give you your change.");
        payment= input.nextInt();
        
        change= payment - total;
        System.out.println("Your change is $" + change);
        
        }
}
        
        
        
        
        
        
        
        
        
        
        
 
