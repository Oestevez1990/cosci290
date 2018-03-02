/*
Omar Estevez
Co Sci

Intro to Arrays

*/

public class Arrays1{

public static void main(String[] args){
  
  //declare an array of type int
  String[] numbers = new String [10];
  
  // interate through the loop and print
  for(int i = 0; i < numbers.lenght; i++){
  System.out.println(numbers[i]);
  }

  //assign element at index 3 the value "five"
  number[3] = "five";
  // numbers[11] = "twenty";// cant do this line, will give arrayIndexOutOfBounds error
  
  //redeclare with a different size because you cant add or remove
  numbers = new String[8];
  
  
}

}