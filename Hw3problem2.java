/*
Omar Estevez
CoSci 290
3/21/18
Hw3 Problem 2.13 ( Financial Application: compound value)

Suppose you save $100 each month into a savings account with an annual interest rate 5%.
Thus, the monthly interest rateis 0.05/12 = 0.00417. After the first month, the value in 
the account becomes 100 * (1 + 0.00417) = 100.417
After the second month, the valuein the account becomes 
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes 
(100 + 201.252) * (1 + 0.00417) = 302.507 
and so on.

Write a program that prompts the user to enter a monthly saving amount and displays
the account value after the 6th moth. (In progarmming excercise 5.30 you will use a
loop to simplify the code and display the account value for any month.)
*/

import java.util.Scanner;

public class Hw3problem2{

  public static void main(String [] args){
    
    Scanner input = new Scanner (System.in);
    
    System.out.println(" Enter the monthly savings amount ");
    
    
    double amount = input.nextDouble();
    
    double total = 0;
      
    total = (total + amount) * 1.00417;
      
    total = (total + amount) * 1.00417;
    
    total = (total + amount) * 1.00417;
    
    total = (total + amount) * 1.00417;
    
    total = (total + amount) * 1.00417;
    
    total = (total + amount) * 1.00417;
    
      System.out.println("After the sixth month, the account value is " + total);
      
  
  
  }

}
