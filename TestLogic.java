/*
  Omar Estevez 
  CoSci 290
  
  Topics:
    -multi- way if-else
    -logocal operators
    -symbolic logic
*/


public class TestLogic{
  
  //entry point of application

  public static void main(String [] args){
    
  
    
    //Setting upScanner for user input
    
    Scanner input = new Scanner(System.in);
     int grade = 90;
    
 /*   System.out.println("Enter in a grade:");
  
    int grade = 90;
    
    //simple if
    if(grade >=90){
      System.out.println("A");
    }
    
    // Two way if- else
    
   if (grade <90){
     System.out.println("grade is not an A");
     
   }
  
    //multi if - else if - else 
   if (grade >+ 90){
     System.out.println("A");
   }
    
    else if (grade >=80){
      System.out.println("B");
      
    }
      
     else if (grade >= 70){
        System.out.println("C");
       
     }

         else{
          System.out.println ("F");
          
         }  */

    /*
    Logical operators
    
   - !    Not
   - !=   Not Equal To 
   - ==   Equals to?
   - &&   And
   - ||   Or
   
   */
    
   //  using if-else, wite code that checks wheter
    // a student grade is good, average, or bad
    
    if (grade >= 80){
      System.out.println("This is a good grade.");
      
      //nested-if  no more than 3
      if(grade >=90){
        System.out.ptintln("Wow, you got an A!");
      }
    }
  
    else if(grade < 80 && grade >= 70){
      System.out.println("This grade is average.");
      
         }
    
    else{
      System.out.println("This is a bad grade");
    }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
     }
  
  
}