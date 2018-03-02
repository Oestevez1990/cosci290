/*     Start of Comments & notes

Omar Estevez 
Co Sci

Comment every single line of code

Inputs: 2 whole numbers 

Output: Your 2 Declared Numbers and Math Operations Results in following order(addition, multiplication, division, subtraction) 


*/ // end of comments, does not affect code 

import java.util.Scanner; // allows you to take user input

public class Practice1{ // Name of Class
  
public static void main(String [] args){      //Main Method, The start point of application 
    Scanner input = new Scanner(System.in);  //instantiate the Scanner object
   
  //variable declarations with default values
  int operand1 ;  //Datatype with indentifier and value of 1
  int operand2 ;  //Datatype with identifier and value of 9
    
System.out.println("please enter in a whole new number...");  // Initial output/ Print out ("")
  
  operand1 = input.nextInt(); //value input
  
  System.out.println("Please enter in another whole new number..."); // Print out ("")
 
  operand2 = input.nextInt();  //value input

  System.out.println("Lets do some basic math!\n"               // Prints out ("") after input value
                     + "Here are the numbers you choose.");    // Prints out ("") after input value
                     
  System.out.println("Operand1: " + operand1 + " and Operand2:" + operand2); // prints out declared values
  System.out.println (operand1 + operand2); // Prints out math operation (addition)
  System.out.println (operand1 * operand2); // Prints out math operation (multiplication)
  System.out.println (operand1 / operand2); // Prints out math operation (division)
  System.out.println (operand1 - operand2); // Prints out math operation (subtraction)
  
  } // end of main method
} // end of class