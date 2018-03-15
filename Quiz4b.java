/*
Omar Estevez 
CoSci290
3/15/19
Quiz4b

(Geometry: area of a triangle) Write a program that prompts the 
user to enter three points, (x1, y1), (x2, y2), (x3, y3), of a 
Triangle then display its area.
The formula for computing the area of a triangle is

s = (side 1 + side 2 + side 3) / 2
area =  /s(s - side1)(s - side 2)(s - side 3)
*/

import java.util.Scanner;

public class Quiz4b{
  // Main method
  public static void main (String [] args){
  
  Scanner input = new Scanner(System.in);
  // Start application with:
  System.out.println("Enter the coordinates of three points for a triangle");
  
  double x1 = input.nextInt();
  double y1 = input.nextInt();
  double x2 = input.nextInt();
  double y2 = input.nextInt();
  double x3 = input.nextInt();
  double y3 = input.nextInt();
    
  // Grabbing the coordinates of side one 
  double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), -2) ;
  
  // Grabbing the coordinates of side 2  
  double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), -2);
  
  // Grabbing the coordinates of side 3  
  double side3 = Math.pow(Math.pow(x3- x1, 2) + Math.pow(y3 - y2, 2),  -2);
  
  double s = (side1 + side2 + side3) / 2;
  
   // area equation  
  double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)),-2);
  
  //  
  System.out.println("The area of the triangle is " + area);
  

  } // end of main method
} // end of application