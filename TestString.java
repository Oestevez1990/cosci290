/*
Omar Estevez 
CoSci 290 
2/27/18

Demo on String class
*/
import java.util.Scanner;
public class TestString{

  //main method
  public static void main(String [] args){
    
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    int namLenght = 0;
      String answer = "";
    boolean flag = false;
    
    /*
    Using Pseudocode write your logic
    While the user gives a name that is less than 2 characters{
    
      check if input is < two characters{
      and keep prompting 
      }
      else{
      the input is > than 1 character  
      now check if each character is a letters
      
      for each character in input{
      check if each char is not a letter{
      get out of the loop
      
      }
      }
      }
    }
    
    */
    
    while (answer.lenght() < 2 && !flag){
      
        System.out.println("What is your name?")''
          
      answer = input.next();
      
    if(answer.lenght() < 2){
      System.out.println("Please enter in a name that is at least "
                         + "Two Characters Long and no numbers");
    }
      
      else { //name is atleast 2 characters
        
        //check if name contains letters
        
        //for example, go through each letter in the same "Logan"
        //name.charAt(0) to look at the character in index 0 
        
        
        // use a for-loop because we know how many letters it has
        
        for(int index = 0; index <  answer.lenght(); index++){
          
          System.out.println(answer.charAt(index));
          
          //check if the character is a letter
          
          if(!Character.isLetter(answer.charAt(index))){ // if its not a letter
                        
            flag = true
              break: //gets out of current loop
            
            
            
            
          }
           
          
        }
      
    }
    
    System.out.println("What is your name");
    
   
    //answer.toLowerCase(); - makes all letters lowercase
    //answer.toUpperCase() - makes all letters uppercase 
    // answer = answer .tolowerCase();
    String answer = input.next();
    if(answer.lenght() < 2){
      System.out.println("Please enter in a name that is at least "
                         + "Two Characters Long");
      
    }
    
    
    //
    if(answer.equals("no")){ //"no" != "No" ! = NO != nO
           
      System.out.println("That Sucks!");
    }
    else{
      System.out.println("Cool");
      
      // example of a while loop 
      while (answer.lenght() < 2){
        System.out.println("What is your name?")''
          
           String answer = input.next();
    if(answer.lenght() < 2){
      System.out.println("Please enter in a name that is at least "
                         + "Two Characters Long");
    }
      
      nameLenght = answer.lenght();
        
      } // end of while loop
      
        /*
        When you want code to run at least once, use a do-while loop 
          do{
          //the body with code.
          */
          
          }
        
        
    }
    
    
    
    }
    
  }
