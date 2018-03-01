/*
Omar Estevez
CoSci 290


Topics:
  fumctions and methods - what all the different parts are
  -access modifier
  -return type
  -function name 
  - Parameters (optional)
  */

public class TestFunctions{

  //entry point of application
  public static void main(String [] args){
  
  /*
    access modifiers
    public - anything can see / access
    private - only functions wihin a class can access
    default - same thing as no written / declared modifier
    
    return types
    -int
    -double
    -String
    -char
    -boolean
    -void -  doesnt return anything
    -also can return different object types
    
    funtion names
    -follows the same rules as any identifier
    -use the name of the function to call it 
    
    
    funtion parameters 
    -input that the function uses inside somewhere in the body 
    -seperate multiple parameters with commas 
    
    
        */
    
    //testing custom funtion called findSum()
    
    System.out.println("The sum of 2 and 3 is:" + findSum(2, 3));
    
    //test printHello()
 
    printHello(" omar ");
  }
  
  //this sum finds the sum of two given numbers
  public static int findSum(int num1, int num2){
   int sum = num1 + num2;
    return sum;
    
   }
  
    
    public static void  printHello(String name){
      System.out.println("Hello " + name);
    }
    
  }
    
    

