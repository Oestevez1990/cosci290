/*
Omar Estevez
Co Sci 290
3/20/18
Lab 10 (Problem 3.8)

(Sort three integers) Write a program that prompts the user to enter three integers
and simply display the integers in non decreasing order.
*/

// import scanner for usage
import java.util.Scanner;

//class name
public class Lab10{
    
    // Main methodethod
    public static void main(String [] args){
     
    // initiate the scanner object for usage  
    Scanner input = new Scanner (System.in);     
     
     // Prompt user with this message   
     System.out.println("Enter Three Intergers");  
 
    //veriables going to be input by user  
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
          
      // Combination #1
      if (num1 > num2 && num2 > num3){
      
        // if true print out:
        System.out.println(( num3 + "\t" + num2 + "\t" + num1));
        
      }
     
      // Combination #2
      else if (num1 < num2 && num2 < num3 ){
      
        // If true Print out:
        System.out.println((num1 + "\t" + num2 + "\t" + num3));
      
      }
    
      // Combination #3
      else if (num2 > num3 && num1 < num3){
        
        // If true Print out:
        System.out.println((num1 + "\t" + num3 + "\t" + num2));
        
      }
     
      // Combination #4
      else if (num3 > num1 && num1 > num2){
        
        //If true print out:
        System.out.println((num2 + "\t" + num1 + "\t" + num3));
        
      }
      
      //any other combination 
      else{
        
        // If true print out:
        System.out.println((num3 + "\t" + num1 + "\t" + num2));
        
      }
      
      
      
      
    } // end of main method
  
} // end of application