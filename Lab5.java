/*
  Omar Estevez 
   Co Sci 290
   
   Lab 5
   - fix the logic and make this code check if each character is a letter
 */
 
 import java.util.Scanner;
 public class Lab5{
   
   // rety=urn true or false 
   public static boolean onlyChar(String input){
     
     for (int i = 0; i < input.length(); i++){
       if (!(Character.isLetter(input.charAt(i))))
         return false;         
     }
     return true;
   }
 // Main method
   public static void main(String[] args){
     //instantiate the Scanner object
     Scanner input = new Scanner(System.in);
     
     int nameLength = 0;
     String answer = "";
     boolean flag = false; //flag is optional

     // Example of while loop
     while(nameLength < 2 || !(onlyChar(answer))){
       
       System.out.println("What is your name?\n"
                         + "Please enter in a name that is at least two letters long and no numbers");
      
       //get answer from console
       answer = input.next();
       
       nameLength = answer.length();
      
     } //end while loop
   } //end of main method
 } //end of class 