/* 
Omar Estevez
CoSci290
3/21/18
Hw3 Problem 2.14 (Health application: computing BMI)
(Health application: computing BMI) is a measure of health on weight.
it can be calculated by taking your weight in kilograms and dividing 
by the square of your height in meters. Write a program that prompts 
the userto enter a weight in pounds and height in inches and displays the BMI.
Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/

// import scanner for usage
import java.util.Scanner;

// class name
public class Hw3problem3{

  // Main method
  public static void main(String [] args){
  
    // initiate the scanner
    Scanner input = new Scanner(System.in);
    
        // prompt user with this line:    
        System.out.println("Enter the weight in pounds");
   
        //weight going to be input by user
        double weight = input.nextDouble();
    
        // prompt user with this line:
        System.out.println("Enter the height in inches");
    
        // height input by user
        double height = input.nextDouble();
    
        //weight equation
        weight = weight * 0.45359237;
    
        // height equation
        height = height * 0.0254;
    
        // compute BMI equation and display result
        System.out.println("Your BMI is:" + (weight / (height * height)));
  
  
  } // end of main method
  
} // end of application 
