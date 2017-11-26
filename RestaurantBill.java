
/*
@author Maryna Yesakova

Restaurant Bill
Write a program that computes tax and tip on a restaurant bill. Ask user to input the bill 
amount and the tip percentage he/she wants to give to the waiter. The tax should be 10% of
the meal cost, and must be set as a constant in your code. The tip should be calculated after 
adding tax. Display the meal cost, tax amount, tip amount, and total bill on the screen.
Name your solution file RestaurantBill.java.
*/
import java.util.Scanner;

public class RestaurantBill 
{
    public static void main(String[] args) 
    {
        double charge; // hold charge of meal    
        double tips; // hold the % of tips which clients want to leave
        final double MEAL_TAX = 0.1; //% of tax which is going to add to charge
        double taxAmount; // tax amount
        double totalWithTax; // charge + Tax
        double tipAmount; // tip % from the charge
        double totalBill; // charge + tax + tip

        // create scanner object to read input 
        Scanner keyboard = new Scanner(System.in);        
        System.out.println("What is your bill amount?");//ask for bill amount from the cliente
        charge = keyboard.nextDouble(); // input the charge              
        System.out.println("What is the percentage of the tips you want to leave?");//ask for % of tips        
        tips = keyboard.nextDouble(); // input the tips

        //colculate the amount of bill tax and tips        
        taxAmount = charge * MEAL_TAX; 
        totalWithTax = charge * MEAL_TAX + charge;
        tipAmount = charge * (tips/100);
        totalBill = totalWithTax + tipAmount;

        //Display all info to cliente        
        System.out.printf("The meal cost is $%.2f\n", charge);
        System.out.printf("Tax amount is $%.2f\n", taxAmount);
        System.out.printf("Tip amount is $%.2f\n", tipAmount);
        System.out.printf("Total bill is $%.2f\n", totalBill);                   
    } //end of main
} // end of class RestaurantBill
