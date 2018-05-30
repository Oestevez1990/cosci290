/*
Omar Estevez
CoSci 290
5/22/18
Lab 22 

A)  Write a program that generates 200 random integers between 0
and 14 and displays the count for each number. (Hint: Use an array of 15 
integers, say counts, to store the counts for the number of 0s, 1s, . . . , 14s.) 

B)  Then let's analyze the data that was randomly generated (make sure to output these):
    Find the number with the max
    Find the number with the min count and display
    Find the average of all the numbers generated
*/
// class name
public class Lab22{
    // main method
    public static void main(String [] args){
      //  array value 
      int[] num = new int[15]; 

        // for loop with equation and random num
        for (int i = 1; i <= 200; i++) {
        num [(int)(Math.random() * 15)]++;
    
    
    } // end of for loop 
         // print out 
        System.out.println("count 200 random number between 0 and 14");
      
        // for loop 
        for (int i = 0; i < num.length; i++){
        
         // print out list of numbers 
        System.out.println(i + "s: " + num[i]);
       
        
      }
        // max and min value
        int max = num[0];
        int min = num[0];
        
        // for loop  find maximum value
        for (int i = 1; i < num.length; i++){
          
        if (num [i] > max) max = num [i];
          
       
       // find minimum value
       else if (num [i] < min) min = num [i];
          
         
        }
      System.out.println("the max value is" + max); // print out max value
      System.out.println("the min value is" + min); // print put min value
      System.out.println("the average value is " + 200 / 15);  // print out average 
      
      } // end of main method 
      
      
  } // end of application 

 
      

  