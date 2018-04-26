/*
Omar Estevez 
Co Sci 290
4/24/18
Lab 15

*6.5 (Sort three numbers)

Write a method with the following header to display three numbers in increasing order:

public static void displaySortedNumbers( double num1, double num2, double num3)
*/
// import scanner for usage
import java.util.Scanner;
//class name  
public class Lab15{
  // main method
  public static void main(String [] args){
    // initiate the scanner 
    Scanner input = new Scanner (System.in);
    // prompt user
    System.out.println("Enter three numbers");
      // variables
      double num1 = input.nextDouble();
      double num2 = input.nextDouble();
      double num3 = input.nextDouble();
       // display in increasing order
      displaySortedNumbers (num1, num2, num3);
  
   }
   // displaySortedNumbers in increasing order
   public static void displaySortedNumbers ( double num1, double num2, double num3){
     
         if ( num1 > num2 && num2 > num3){
           System.out.println((num3 + "\t" + num2 + "\t" + num1));
       
     }
       
         else if ( num1 < num2 && num2 < num3){
           System.out.println((num1 + "\t" + num2 + "\t" + num3));
         
     }
         
         else if( num2 > num3 && num1 < num3){
         
           System.out.println((num1 + "\t" + num3 + "\t" + num2));
     }
     
         else if( num3 > num1 && num1 > num2){
          
           System.out.println((num2 + "\t" + num1 + "\t" + num3));
          
     }
      
         else if(num1 > num3 && num2 > num1){
          
           System.out.println((num3 + "\t" + num1 + "\t" + num2));
     }
         
         else{
          
           System.out.println((num2 + "\t" + num3+ "\t" + num1));
     }
         
       
       
     
     
  } //end of main method
  
  
    
    
} // end of application 

