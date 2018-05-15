/*
Omar Estevez 
  purpose: go over the basics of an array
  */
  
  public class TestArrays{
  
  //stating point of program
  public static void main(String[] args){
  
    // declare an array of integers
    int[] numbers = new int[5];
    
    // {0,0,0,0,0}
    //  0,1,2,3,4
    
    // assign a value inside this array called numbers   
     numbers[0] = 100;
     numbers[1] = 33;
     numbers[2] = -1;
     numbers[3] = 3;
     numbers[4] = -8;
    
    //update a value
    numbers[0] = 3;
    numbers = new int[6];
    // {0,0,0,0,0,0}
    //  0,0,0,0,0,-12
    numbers[5] = -12;
    
    // randomly assign ints to each index using a loop
    for (int i = 0; i < 6; i++){
      numbers[i] = (int) (Math.random() * 100) + 1;
    }  
    
    // print out each element (interate the array)
    for (int i = 0; i < 6; i++){
      System.out.println (numbers[i] + "");
      
    }
    
    System.out.println(numbers[4]);
    
    
  } // end main
  } // end class














