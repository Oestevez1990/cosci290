


public class DemoBooLean {

  public static void main(String[] args){


  int num = 1;
  
   num = num + 1 ;
    
  num++ ;  //post increment 

   ++num ;  // pre increment 

  num = 1 ;  
    
  int count = num++ ;
    
  System.out.println("count " + count + " num " + num );
    
  count = num-- ; // post decrement
    
  count = --num ;    // pre decrement 
    
    
    
    num += 2 ;
      
    num *= 2 ; 
    
    num /= 2 ;  
    
    num -= 2 ;  
     
    
    double num2 = 3.0;
    
    System.out.println("Double wins: " + num * num2);
    System.out.println("Casting a double to int: " + (int) num2); // lose the decimal part
    System.out.println("Casting an int to a double " + (double) num); // turns the 2 into 2.0
    System.out.println("Casting a char to an int " + (int) 'c'); // turns the  c into 99 because of ASC
    
    
    int numberOfZombies = 3;
    
      if(numberOfZombies == 5){
        System.out.println("You might survive this apocalypse. ");
        System.out.println("Oh No!");
        
      }
      
      else{
        System.out.println("You might not survive this apocalypse.");
           
      } 
 
  //generating a random number 
    //Math.pow(3, 2); 3^2
    System.out.println(Math.random());// random number between 0 and 1
    
  // minimum + Math.random() * maximum
    
  System.out.println(1 +(int)(Math.random() * (10 - 5)));
  
  int chanceOfSurviving = 1 + (int)(Math.random() * (10 - 1));
    System.out.println("Random num: " + chanceOfSurviving);
    
    if ( chanceOfSurviving <= 3){
      System.out.println("You made it alive!");
    }
    else{
      System.out.println("Game Over!");
      
    }
  
  
  }
    
    
    
    
    
    
    
    
    
}