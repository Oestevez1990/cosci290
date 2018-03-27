/*
Omar Estevez
CoSci290
3/27/18
Midterm Exam

Midterm (Palindrome number) Write a program that prompts the user to enter a Five-digit
integer and determines whether it is a palindrome number. A number is palindrome if it 
reads the same from right to left and from left to right.
*/

// importing scanner for usage         
import java.util.Scanner;

//Class name
public class Midterm{

    // Main Method  
    public static void main(String [] args){
      
      //Initiate the scanner 
      Scanner input = new Scanner (System.in);
        
        // Prompt user with this line:
        System.out.println("Enter a five digit integer");
      
      // variables and values
      // allows user to enter the number
      int number = input.nextInt(); 
      // giving value to digit1
      int digit1 = (number / 10000); 
      // giving value to digit2
      int digit2 = (number / 1000);
      // giving value to digit3
      int digit3 = (number % 10000);
      // giving value to digit4
      int digit4 = (digit3 % 100);
      // giving value to digit5
      int digit5 = (digit2 % 10);  

      // if digit 1 is the same as digit 5 and digit 2 is the same as digit 4 print out number is a palindrome
      if (digit1 == digit5 && digit2 == digit4){
        
        System.out.println(number + " Is a palindrome");
        
      }
      
      // if digit 1 is not the same as digit 5 or digit 2 is not the same as digit 4, print out number is not a palindrome
      else{
        
        System.out.println(number + " Is not a palindrome");
        
      }
    
    
    } // end of main method 
  
} //end of application

