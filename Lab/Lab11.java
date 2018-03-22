/*
Omar Estevez
CoSci290
3/22/18
Lab11 (Review for midterm)

Topics - Print statements for output (concatenation, escape characters)
         Using the scanner class for user input
         Datatypes
         Using the Math class for math
         Procedurally solving a math problem by receiving the correct inputs and displaying the correct output
         Operators (Logical, Arithmetic, Comparison)
         Conditional expressions and Control Structures with boolean  (if, else if, else, nested ifs)
         
         
  Lab 11 Problem 3.12 (Palindrome number) Write a program that prompts the user to enter a three-digit
         integer and determines whether it is a palindrome number. A number is palindrome if it 
         reads the same from right to left and from left to right. A negative integer is treated the same 
         as a positive integer.
         */

// importing scanner for usage         
import java.util.Scanner;

//Class name
public class Lab11{

    // Main Method  
    public static void main(String [] args){
      
      //Initiate the scanner 
      Scanner input = new Scanner (System.in);
        
        // Prompt user with this line:
        System.out.println("Enter a three digit integer");
      
      // variables and values
      int number = input.nextInt();
      int digit1 = (number / 100);
      int digit2 = (number % 100);
      int digit3 = (digit2 % 10);
        

      // if digit 1 is the same as digit 3, print out number is a palindrome
      if (digit1 == digit3){
        
        System.out.println(number + " Is a palindrome");
        
      }
      
      // if digit 1 is not the same as digit 3, print out number is not a palindrome
      else{
        
        System.out.println(number + " Is not a palindrome");
        
      }
    
    
    } // end of main method 
  
} //end of application


         
