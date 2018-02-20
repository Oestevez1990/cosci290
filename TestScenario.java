




public class TestScenario
  public static void main(String [] args){
  
  
    int minimum =1
    int maximum = 100
    int  randomNum = minimum + (int)(Math.random() * maximum);
  
    if(randomNum >=90){
      System.out.println("You get a gun!");
      
    }
  
    else if(randomNum <= 80 && randomNum >= 70){
      System.out.println("You get a rock!");
      
      
    }
  
    else{
      System.out.println("You're on your own.");
    }
  
  }