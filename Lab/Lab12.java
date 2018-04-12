/*
  Omar Estevez
  CoSci 290
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code and/or modify the code so that the following output is achieved:
	Sample output with odd number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...
	Sample output with even number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...
	
	NOTE: Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/
// Importing scanner for usage
import java.util.Scanner;

// Class name
public class Lab12{
	
	// Main Method
	public static void main(String [] args){
		
		// Initiate Scanner 
		Scanner input = new Scanner(System.in);

		// Prompt user with this lines
		System.out.println("This program will check if a number is even or odd...");
		
		System.out.println("Please enter in a whole number...");
		
		// Variables and value going to be input by user
	 	int number = input.nextInt();
			
			// Math equation (If the number does not have a remainder when divided by 2, the number is even)
			if(number % 2 == 0){
				System.out.println("The number " + number + " is even...");
	
			}
			
			// if the number has a remainder when divided by 2, the number is odd.
			else{
			System.out.println("The number " + number + " is odd...");
		
			}
	
		} // end of main method 
	} // end of application
