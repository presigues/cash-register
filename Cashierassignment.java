/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cashierassignment;

/*

Name : Preston Messina
Date : Thursday September 12th, 2024
Title : Cash Register Assignment
Desc : a project where you can type certain item into a search bar to be able to order them, you can choose how many of each item to order and when you are the program will automaticlly calculate the total and tax.


*/


import java.math.RoundingMode; // imports abilty to round numbers
import java.text.DecimalFormat; // imports ability to format decimals into 2 decimal places
import java.util.Scanner; // imports the ability to gather user input
/**
 *
 * @author pres2590
 */
public class Cashierassignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in); // creates a scanner to be able to gather user input
        
        
        String status; // creates string for search
        boolean exit = false; // creates varible for if the user has exited
        
        DecimalFormat df = new DecimalFormat("#.##"); // creates a new decimal format to limit dobules to 2 decimal places
        df.setRoundingMode(RoundingMode.CEILING); // sets the roundind mode to ceiling

        String cashier = "theman"; // creates a string name for the cashier
        
        String cookiename = "cookie"; // creates a string for the cookie name
        double cookieprice = 2.99; // creates a double for the cookie price
       int cookquant = 0;
        // creates an int for the cookie quantity and sets it to zero
                
        String barname = "bar"; // creates a string for the bar name
        double barprice = 3.99; 
  int barquant = 0;// creates a double for the bar price
    // creates an int for the bar quantity and sets it to zero
                
        String chipname = "chips"; // creates a string for the chip name
        double chipprice = 2.49; // creates a double for the chip price
        int chipquant = 0;
         // creates an int for the chip quantity and sets it to zero
        
        String applename = "apple"; // creates a string for the apple name
        double appleprice = 1.99; // creates a double for the apple price
        int applequant = 0; // creates an int for the apple quantity and sets it to zero
         
        double chiptotal = 0, cooktotal = 0, bartotal = 0, appletotal = 0; // creates totl variables for all the tiems and set their total to 0              
        
        do{ // start of do while statement
    
            System.out.print("What would you like to order - type word w/ no caps - type done to finalize - type x to exit >>>> "); // prints a question of what you would like to buy
        status = sc.nextLine(); // sets staus to whatever the user types and finalizes 
    
        
            switch(status){ // start of switch statment
                case "cookie": // if status === cookie
                  do{
                    System.out.print("Quantity >>>> ");// print question of how much of said item you want
                    cookquant = sc.nextInt();// sets cookie quantity to whateverthe user types next and finalizes 
                     sc.nextLine();
                  }while(cookquant < 0);// will only continue if number is not negitive
                  
                   cooktotal = cooktotal + cookieprice * cookquant; // calculates the total by multiplying the qaunityt to the cookie price
                   System.out.println("Total >>> "+ "$" + df.format(cooktotal)); // prints out the total
                   
                   System.out.println(""); // prints a space
        
                    break; // breaks the segment so it wont loop
                    
                case "bar": // if status === bar
                    
                    do{
                     System.out.print("Quantity >>>> ");  // print question of how much of said item you want
                     barquant = sc.nextInt();// sets bar quantity to whatever the user types next and finalizes 
                     sc.nextLine();
                    }while(barquant < 0); // will only continue if number is not negitive
                    
                   bartotal= bartotal + barprice * barquant; // calculates the total by multiplying the quantity to the bar price
                   System.out.println("Total >>> "+ "$" + df.format(bartotal)); // prints out the total
                   
                   System.out.println(""); // prints a space
                   
                    break; // breaks the segment so it wont loop
                    
                case "chips": // if status === chips
                    do{
                     System.out.print("Quantity >>>> ");  // print question of how much of said item you want
                     chipquant = sc.nextInt();// sets chip quantity to whatever the user types next and finalizes
                     sc.nextLine();
                    }while(chipquant < 0); // will only continue if number is not negitive
                    
                   chiptotal= chiptotal + chipprice * chipquant; // calculates the total by multiplying the quantity to the chips price
                   System.out.println("Total >>> "+ "$" + df.format(chiptotal)); // prints out the total
                   
                   System.out.println(""); // prints a space
                    break; // breaks the segment so it wont loop
                    
                case "apple": 

                  do{// if status === apple
                    System.out.print("Quantity >>>> ");  // print question of how much of said item you want
                    applequant = sc.nextInt();// sets apple quantity to whatever the user types next and finalizes 
                    sc.nextLine();
                    }while(applequant < 0);// will only continue if number is not negitive
                   appletotal= appletotal + appleprice * applequant; // calculates the total by multiplying the quantity to the apple price
                   System.out.println("Total >>> " + "$" + df.format(appletotal)); // prints out the total
                   System.out.println(""); // prints a space
        
                    break; // breaks the segment so it wont loop
                    
                    
                case "x": // if status == x 
                    exit = true; // exit = true meaning the program will end
                    break; // breaks the segment so it wont loop
                    
                case "done": // if status = done
                    
                    double fulltotal = chiptotal + cooktotal + bartotal + appletotal;  // make a variable for the total and calculate the full total by adding the item totals together
                    double tax = fulltotal * .13; // makes a variable for tax and calculates tax by multiplying the full total by .13
                    double finaltotal = fulltotal + tax; // makes varibale for finaltotal by adding full total and tax
                    
                    df.format(fulltotal); // formats to 2 decimal places
                    df.format(tax); // formats to 2 decimal places
                    df.format(finaltotal); // formats to 2 decimal places
                    
                    // STARTS TO PRINT RECIEPT
                    
                    System.out.println("__________________________________");
                    System.out.println("|           THE STORE            |"); // prints store title
                    System.out.println("|                                |"); // prints cashier name from cashier string
                    System.out.println("|       CASHIER : " + cashier + "         |");
                    System.out.println("|                                |");
                    System.out.println("|                                |");
                    if(cookquant == 0){ // if there is none of this item it wont print
                        
                    }else{ // if there is it will print
                    System.out.println("| " + cookiename + "        " + "$" +  df.format(cooktotal)+ "      " + cookquant ); // prints name, total, and quantity  and formats   
                    }
                    if(chipquant== 0){ // if there is none of this item it wont print
                        
                    }else{ // if there is it will print
                    System.out.println("| "+chipname + "         " + "$" +   df.format(chiptotal) + "      " + chipquant); // prints name, total, and quantity and formats
                    }
                    if(barquant == 0) { // if there is none of this item it wont print
                        
                    }else{ // if there is it will print
                    System.out.println("| "+barname + "           " + "$" +   df.format(bartotal) + "      " + barquant); // prints name, total, and quantity   and formats
                    }
                     if(applequant == 0) { // if there is none of this item it wont print
                        
                    }else{ // if there is it will print
                    System.out.println("| "+applename + "         " + "$" +   df.format(appletotal) + "       " + applequant);  // prints name, total, and quantity and formats
                    }
                    
                     System.out.println("|                                |");
                      System.out.println("|                                |");
                       System.out.println("|            SUBTOTAL> " + "$" +  df.format(fulltotal) + "      "); // prints the sub total w/ formating
                       System.out.println("|            HST> " + "$" +  df.format(tax) + "   "); // prints the tax w/ formating
                        System.out.println("|            TOTAL> " + "$" +  df.format(finaltotal) + "   "); // prints the final total w/ formating 
                    
                    System.out.println("|                                |");
                    System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ "); // end of reciept
                    
                    exit = true; // exits out of program   
                    break;//breaks so wont loop  
                    
                   default: System.out.println("Invalid choice"); // will print if the choice is invalid        
        }
            
        }while(exit==false); // if exit doesnt == false then code will exit  
        
       

        
       // end
        
        
                
        
    }
    
}
