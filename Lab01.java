/* 
Omar Estevez 
2/13/18
Cosci 290

preparing for group project 

*/

import java.util.Scanner;

public class Lab01{
  
   public static void main(String [] args) {
    
  Scanner input = new Scanner (System.in);
  
  System.out.println("The year is 2327. Humanity has accelerated the space travel project\n"
                    + " and successfully colonized many palnets on the outer rim.\n"
                    + "However upon entering a hollow planet, they discoveredan alien\n"
                    + "You are the commanderof a crew.\n"
                    + "what is your name, space commander?:"); 
  
    String name = input.next();
  
    System.out.println("What is your weapon of choice?: ");
       
    String weaponOfChoice = input.next();
  
     System.out.println("What is the name of the planet you crashed landed?");
     
     String nameOfPlanet = input.next();
     
     System.out.println("How many survivors left?");
     
     int numberOfSurvivors = input.nextInt();
  
   }
}