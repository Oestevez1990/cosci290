/*
Omar Estevez
Co Sci 290
5/10/18
Quiz 5



Write a program that uses Scanner to prompt the user for a name. Loop through each 
character in this name to count how many vowels are in this name.

For example, 

String name = "Sina";

Using the charAt(i) built-in function for the String class, you can use a for-loop to 
go through each index (which is each character in the name) and nest if-statements to 
check for cases when the character is equal to 'a', 'e', 'i', 'o', or 'u' (we will ignore 'y'). 

So, using the following code bit:

name.charAt(i)

in a loop will allow you to grab that character at that index. Be sure to use i < name.length() 
in the conditional in the for-loop to terminate the loop.

Based on the example above, the output should be:

"There are 2 vowels in the name Sina."

Be sure to do this with your name instead when testing and to concatenate the String accordingly.

*/

// Import scanner for usage 
import java.util.Scanner;

// name of class
public class Quiz5{

  // main method
  public static void main(String [] args){
    
    //Variables 
    int vowelA = 0;
    int vowelE = 0;  
    int vowelI = 0;
    int vowelO = 0;
    int vowelU = 0;  
    
    // initiate scanner
    Scanner scan = new Scanner (System.in);
    
    //prompt user with line
    System.out.println(" Enter your full name ");
    
    // string str to scan the next line of characters
    String str = scan.nextLine();
  
     // for loop 
    for (int i = 0; i < str.length(); i++) {
      
      switch(str.charAt(i)){
          
         // scan for upper and lower case 
          case 'a':
          case 'A':
               vowelA++;
               break;
           case 'e':
           case 'E':
               vowelE++;
               break;
           case 'i':
           case 'I':
               vowelI++;
               break;
           case 'o':
           case 'O':
               vowelO++;
               break;
           case 'u':
           case 'U':
               vowelU++;
               break;
           default:
               break;
      } // end of switch 
      
    } // end of for loop 
    
    // print out each vowel count
    System.out.println(" Number of each vowel");
    System.out.println("A" + vowelA);
    System.out.println("E" + vowelE); 
    System.out.println("I" + vowelI); 
    System.out.println("O" + vowelO); 
    System.out.println("U" + vowelU);
    
  
  } // end of main method

} // end of application 

























