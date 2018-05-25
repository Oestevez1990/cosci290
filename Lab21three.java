/*
Omar Estevez
CoSci 290
5/17/18
Lab 21 problem 7.15

(Eliminate duplicates) Write a method that returns a new array by eliminating 
the duplicate values in the array using the following method header:

public static int[] eliminateDuplicates(int[] list)

Write a test program that reads in ten integers, invokes the method, and displays the results.
*/
import java.util.Scanner;
// Name of Class
public class Lab21three{
  // Main Method
  public static void main(String [] args){
     // Creating Scanner
    Scanner input = new Scanner(System.in);
    //Array of length 10
    int [] numbers = new int[10];
     // Prompt the user to enter ten numbers
	  System.out.print("Enter ten numbers: ");
    
	    for (int i = 0; i < numbers.length; i++)
    	numbers[i] = input.nextInt();

	      // Getting the distinct numbers
	      int[] nonDuplicates = eliminateDuplicates(numbers);

	      // Print out the distinct numbers are
	      System.out.print("Distinct numbers :");
	      for (int a: nonDuplicates) {
	      if (a > 0)
	      System.out.print(" " + a);
	    }
      	System.out.println();
	} // end of main method 

	       // eleminateDuplicates returns a new array with duplicate values eliminated 
	       public static int[] eliminateDuplicates(int[] list) {
	       int[] differentList = new int[list.length];
         // index distinctList
	       int i = 0;
         // for loop 
	       for (int a: list) {
         if (linearSearch(differentList, a) == -1) {
	       differentList[i] = a;
	       i++;
      	}
	   }
	      return differentList;
	} // end of eliminateDuplicates method

	      //linearSearch
      	public static int linearSearch(int[] array, int key) {
      	for (int i = 0; i < array.length; i++) {
      	if (key == array[i])
	      return i;
  	} //end of loop 
      return -1;
	}
} // end of application 






















