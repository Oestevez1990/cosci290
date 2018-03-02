/*
  Omar Estevez
  2/13/18
  Co Sci 290 
  
  Testing Datatypes and input from the user
  
  */

import java.util.Scanner; // is a java object that allows you to take user input 
  
 public class TestInput{

  // main method - starting point of application
  public static void main(String [] args) {
    //datatypr variableName = expression
    //1.Identifiers can only start with a letter, _, or $
    // e.g. - numOfStudents, name, interestRate,
    
    //datatypes 
    //int - integers - whole number => 3, 2147483647. 102, -11
    //double - decimal number => 3.33, 0.2, 0.33333, -33.33
    //char - single charracter inside single quotations => '3', '!', ' '
    //boolean - true or false => true, false
    
    //object/reference datatypes
    //String - characters surrounded with double quotations => "skldfjsdk", "cat" "3"
    /*there are other objects in java that comes with java and that are custom
     => objects/class that comes with java: Scanner, System, etc.
     => Customer classes: Zombie, SpaceInvader, Person, etc. 
   */
    
    
    final double PI_VALUE = 3.1415; //costants are all capital, multiplies words seperated by underscores
    String name = "sina" ;
    name = "Cesar";
    int numberOfStudents = 29;
    double avgGPA = 3.78;
    
    Scanner input = new Scanner(System.in); 
    
    name =input.next();
    
    
    
    System.out.println("Hi " + name);
    
    
    System.out.println("How old are you?");
    
    int age = input.nextInt(); //nextInt is for int types 
    
    System.out.println("You are " + age + " years old!");
    
    
    
      /*
       Arithmatic Operators
       + addition
       - subtracion
       * multiplication
       / division
       = assignment operator, equals
       
       Programming Math operations follow the same order of operations as in Math 
       (), exponents, multiplication OR division, addition OR subtraction 
       from left to right
       
       */
       
    int month = age * 12;
    int days = age * 365;
    int hours = days * 24;
    
    System.out.println("You are " + month + " months old OR " + days + " days old OR "
                      + hours + " hours old!");
    
    
    
    
    
    
    
    
  }
}