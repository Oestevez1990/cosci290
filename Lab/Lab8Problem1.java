/*
Omar Estevez
CoSci290
3/13/18
Lab 8

problem 2.1 

(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree 
in a double value from the console, then converts it to fahrenheit, and displays 
the result. The formula for the conversion is as follows:

fahrenheit = (9 / 5) * celsius + 32

Hint: in Java, 9 / 5 is 1 but 9.0 / 5 is 1.8 
*/

// import scanner for usage
import java.util.Scanner ;

public class Lab8Problem1{
  
  // Entry point of app
  public static void main(String [] args){
    
    // Instantiate the Scanner object for usage, call it input
    Scanner input = new Scanner(System.in);
    
    // game starts 
    System.out.print("Enter a degree in fahrenheit: ");
    
    double fahrenheit = input.nextDouble();
    
    // Converting fahrenheit to celsius
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    
    // prints out answer
    System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in celsius ");
  }
}
  
