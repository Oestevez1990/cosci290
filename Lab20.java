/*
Omar Estevez
CoSci 290

GROUP1

Watch demo on arrays. 

Lab 20

Create an array of Strings with the size 5. Assign each index
with five Strings of your choice. Use a for-loop to iterate through 
the loop and print each element. 

*/
// class name
public class Lab20{
 // main method 
  public static void main(String[] args){
   // declaring array of strings
   String [] strings = new String [5];
     // string value
     strings[0] = "Network";
     strings[1] = "Security";
     strings[2] = "SysAdmin";
     strings[3] = "Managment";
     strings[4] = "WebDev";
     // for loop 
     for (int i = 0; i < 4; i++){
      // print out strings   
     System.out.println (strings[i] + "");
       
     } // end of for loop     
    
    } // end of main method  
  
  } // end of application



