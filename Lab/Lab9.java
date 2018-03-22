/*
Omar Estevez
CoSci 290
3/14/18
Lab 9 

(Sum the digits in an integer) write a program that reads an integer 
between o and 1000 and add all the digits in the integer. for example,
if an integer is 932, the sum of all its digits is 14. Hint: use the %
operator to extract digits, and use the / operator to remove the extracted 
digit. For instance, 932 % 10 = 2 and 932/10 =93. 
*/
//Import scanner for usage
import java.util.Scanner;

//class name
public class Lab9{

  // main method
  public static void main(String [] args){
  
    // initiate the scanner object for usage
    Scanner input = new Scanner(System.in);
    
      // prompt user with this line    
      System.out.println("Enter a number between 0 and 100 ");
    
      // variables    
      int num1 =input.nextInt();
      
      // equation for first digit 
      int num2 = num1 % 10;
    
      num1 /=10;
      
      // equation for seconfd digit
      int num3 = num1 % 10;
    
      num1 /= 10;
    
      // equation for 3rd digit   
      int num4 = num1 % 10;
    
      num1 /= 10;
    
      //  compute this sum 
      int sum = num2 + num3 + num4;
    
      // Result with line 
      System.out.println("The sum of these numers is " + sum );
    
    
    
    
    
  } // end of main method
  
} // end of application 
