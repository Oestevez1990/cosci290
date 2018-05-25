/* 
Omar Estevez
CoSci 290
Lab 21 Problem 7.7
5/17/18

(Count single digits) Write a program that generates 100 random integers 
between 0 and 9 and displays the count for each number. (Hint: Use an array
of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)

*/ 
// class name
public class Lab21one{
    // main method
    public static void main(String [] args){
      // array value
     int[] num = new int[10]; 
      //for loop  with random num equation 
      for (int i = 1; i <= 100; i++) {
        num [(int)(Math.random() * 10)]++;
        
      } // end of loop 
       // print out 
      System.out.println("count 100 random number between 0 and 9");
      // for loop  for list
      for (int i = 0; i < num.length; i++){
         // primt out numbers in a list 
        System.out.println(i + "s: " + num[i]);
      } // end of loop 
    
    
    } // end of main method
} //end of application 