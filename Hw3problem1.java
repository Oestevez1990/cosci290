/*
Omar Estevez 
CoSci 290
3/21/18
Hw3 Problem 2.12 (Physics: finding runway lenght)

Given an airplane's acceleration  a and take-off speen v, you can compute the minimum runway
lenght needed for an airplane to take off using the following formula:
lenght = v^2 % 2a

Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration
a in meters/second squared (m/s^2), then, displays the minimum runway lenght. 
*/
//import scanner for usage
import java.util.Scanner;

// class name
public class Hw3problem1{
  
  // main method
  public static void main(String [] args){
    
    // initiate the scanner 
    Scanner input =new Scanner(System.in);
    
    // prompt the user with this line
    System.out.println("Enter Speed and Acceleration ");
    
    // variables 
    double speed = input.nextDouble();
    
    double acceleration = input.nextDouble();
    
    // equation 
    double lenght = (speed * speed) / (acceleration * 2);
    
    // result output
    System.out.println("The minimum runway lenght for this airplane is " + lenght);
  
    
  
  } // end of main method
  
} // end of application 

