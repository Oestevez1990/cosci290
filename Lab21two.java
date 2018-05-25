/*
Omar Estevez
CoSci 290
5/17/18
Lab 21 Problem 7.12

(Reverse an array) The reverse method in Section 7.7 reverses an 
array by copying it to a new array. Rewrite the method that reverses 
the array passed in the argument and returns this array. Write a test 
program that prompts the user to enter ten numbers, invokes the method 
to reverse the numbers, and displays the numbers.
*/

// import scanner for usage
import java.util.Scanner;

// class name
public class Lab21two{

    // main method
  public static void main(String [] args){
    
    // initiate scanner
    Scanner input = new Scanner (System.in);
    int[] numbers = new int[10];
    
    // prompt user to enter 10 numbers
    System.out.print("Enter ten numbers: ");
    // for loop 
    for (int i = 0; i < numbers.length; i++)
      numbers[i] = input.nextInt();
  
     reverse(numbers);
    // loop 
    for (int e: numbers) {
      System.out.println(e + "");
    } // end of for loop 
      System.out.println();
  }// end of main method
      // reverse method 
      public static void reverse (int[] list) {
        
        int temp;
        // for loop problem
      for (int i = 0, j = list.length - 1; i < list.length /2; i++, j--) {
        
        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
      } // end of for loop 
      
    } // end of reverse method
  
  } // end of application 
