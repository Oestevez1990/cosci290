/* 
  Autor Omar Estevez 
  
  Lecture:
    Introduction to methods.
    
  Lab:
    Finish the multiply and division methods.
  */

public class Lab13{
  
  // start of program
  public static void main (String [] args){
    
    //declare variables
    int a = 1;
    int b = 3;
    int c = 0;
    int d = -5;
    System.out.println("Operations on a = " + a + " and b = " + b + " : ");
    System.out.println("addition = " + add (a, b));
    System.out.println("Subtraction = " + subtract (a, b)); 
    System.out.println("multiplication = " + multiply (a,b));
    System.out.println("division = " + division (a,b));
   
    System.out.println("Operations on c = " + c + " and d = " + d + " : ");
    System.out.println("addition = " + add (c, d));
    System.out.println("Subtraction = " + subtract (c, d)); 
    System.out.println("multiplication = " + multiply (c,d));
    System.out.println("division = " + division (c,d));
    
  } // end of main method
   
    // this custom method adds two integers
   public static int add(int num1, int num2){
    
    // declare variables
    int sum = 0;
    
    // add num 1 and num2
    sum = num1 + num2;
    
    // return sum of num1 and num2
    return sum; 
    
    
 }  // end of add
  
    //this custom method subtracts two numbers
   public static int subtract (int num1, int num2){
        
    // declare variables
    int difference = 0;
     
    //subtract num1 by num2 and assign to difference  
    difference = num1 - num2;
    
   return difference;
     
 } // end of add
  
    // this custom method multiply two numbers
   public static int multiply (int num1, int num2){
    
    // declare variables
    int product = 0;
    
    // multiply num1 and num2 
    product = num1 * num2;
    
    return product;
     
  } // end of add
  
    //This custom method divides two numbers
   public static int division (int num1, int num2){
    
    //declare variables
    int quotient = 0;
    
    // divide num1 by num2
    quotient = num1 / num2;
    
    return quotient;
    
  } // end of add
  
  
  
  
} // end of class













