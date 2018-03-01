/*
   Omar Estevez 
   Co Sci 290
   
   Lab 5
   - fix the logic and make this code check if each character is a letter
 */
 
 import java.util.Scanner;
 public class Lab5Test{
 
   public static void main(String[] args){
     //instantiate the Scanner object
     Scanner input = new Scanner(System.in);
     
     int nameLength = 0;
     String answer = "";
     boolean flag = false; //flag is optional

     while(nameLength < 2){
       
       System.out.println("What is your name?");
     
       answer = input.next();
       
       for(int index = 0; index < answer.length(); index++){
           
           System.out.println(answer.charAt(index));
         
          if(!Character.isLetter(answer.charAt(index))){ //if it's not a letter
             System.out.println("Please enter in a name that is at least "
                   + "two letters long and no numbers");
            break;
       }
             
         else if(answer.length() == 2){
       System.out.println("Please enter in a name that is at least "
                         + "two letters long and no numbers");
          break;
       }
         
         
             //check if the character is a letter or number
           
         //end of for-loop
        
       
       
       nameLength = answer.length();
     }
   }
 }  //end while loop
 }   //end of main method
   //end of class 
 