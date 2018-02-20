/*
Omar Estevez
CoSci 290
2/20/2018

*/

import java.util.Scanner;

public class Lab3 {

public static void main(String [] args){

 Scanner input = new Scanner (System.in);
 
 int howPatient = 0;
    
     System.out.println("From 1 - 10 how patient are you?"); 
    
    howPatient = input.nextInt();
    
    if (howPatient >= 7){
         System.out.println("PERFECT! Just her type!");
      
      if(howPatient == 7){
        System.out.println("Lucky Number 7! I wish you luck!");
      }
                          
    }
           
    else if(howPatient < 7){
      System.out.println("Psh Good Luck\n"
                        + "You better run while you still can");                    
    }
  }
}   