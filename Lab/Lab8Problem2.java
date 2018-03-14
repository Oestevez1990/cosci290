/*
Omar Estevez 
3/13/18
CoSci290
Lab 8 Problem 2.2

(Compute the volume of a cylinder) Write a program that reads in the radius and lenght
of a cylinder and computes the area and volume using the following formulas: 

area = radius * radius * pi

volume = area * lenght

*/
// import scanner for usage

import java.util.Scanner;

public class Lab8Problem2{
  
   // Main Method
   public static void main(String [] args){
   
     // Initiate the scanner
     Scanner input = new Scanner(System.in);
     
     // variable
     final double PI = 3.1415;
     
     // prompt user with message 
     System.out.println("Enter a number for radius and lenght of a cylinder: ");
     
     double radius = input.nextDouble();
     
     double lenght = input.nextDouble();
 
     //comput the area
     double area = radius * radius * PI;
     
     //comput the volume
     double volume = area * lenght;
     
     // Print out Result for area
     System.out.println("The area is " + area);
     
     // Print out result for volume
     System.out.println("The volume is " + volume);


 } // end of main method 
} // end of class
