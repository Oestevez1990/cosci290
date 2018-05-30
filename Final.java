/*
Omar Estevez
CoSci290
5/29/18
Final

Write a program that generates 300 random integers between 0 and 14 and displays the 
count for each number. (Hint: Use an array of 15 integers, say counts, to store the counts 
for the number of 0s, 1s, . . . , 14s.)

B. Then let's analyze the data that was randomly generated (make sure to output these):

    Find the total counts for even numbers (zero is an even number)
    Find the total counts for odd numbers 
*/

// class name
public class Final{
    // main method
    public static void main(String [] args){
      //  array value 
      int[] num = new int[15]; 

        // for loop with equation and random num
        for (int i = 1; i <= 300; i++) {
        num [(int)(Math.random() * 15)]++;
    
    
      } // end of for loop 
         // print out 
        System.out.println("count 300 random number between 0 and 14");
      
        // for loop 
        for (int i = 0; i < num.length; i++){
        
         // print out list of numbers 
        System.out.println(i + "s: " + num[i]);
       
        }
        int odd = num[0];
        int even = num[0];
        
        // for loop  find even count
        for (int i = 1; i < num.length; i++){
          
        if (num [i] > even) even = num [i];
          
       
       // find odd value
       else if (num [i] < odd) odd = num [i];
          
         
        }
      System.out.println("the odd  is" + odd + num.length); // print out odd value
      System.out.println("the even count is" + even + num.length); // print out even  value
      
      } // end of main method 
      
      
  } // end of application 


    
