/* 
Omar Estevez
CoSci290
3/13/18

Lab7 

Requirements 
1. Opening ASCII splash screen
2. Ask user for 6 questions related to your story
 - Output each answer for feedback to the user
3. Story Development
4. Closing ASCII splash screen
5. Commenting on all lines

*/

//import Scanner for usage
import java.util.Scanner;

// class name
public class Lab7 {
  
 // Start of Application / Main method
  public static void main(String [] args){
   
     //variable declarations with default values
    Scanner input = new Scanner (System.in);  //initialize Scanner for user input
    int relationshipPartners = 0;
    int randomNum = 0;
    int minimum = 1; //set min for range for random numbers
    int maximum = 10; //set max for range for random numbers
    int howPatient;
    String beginsOrEnds;
    String doYouUnderstand;
    String yesOrNo;
    String outToEat;


    // Splash Screen
    System.out.println( "@@@  @@@   @@@@@@   @@@@@@@  @@@  @@@  @@@ @@@ \n"
                      + "@@@  @@@  @@@@@@@@  @@@@@@@  @@@  @@@  @@@ @@@ \n"
                      + "@@!  !@@  @@!  @@@    @@!    @@!  @@@  @@! !@@ \n"  
                      + "!@!  @!!  !@!  @!@    !@!    !@!  @!@  !@! @!! \n"
                      + "@!@@!@!   @!@!@!@!    @!!    @!@!@!@!   !@!@!  \n" 
                      + "!!@!!!    !!!@!!!!    !!!    !!!@!!!!    @!!!  \n" 
                      + "!!: :!!   !!:  !!!    !!:    !!:  !!!    !!:   \n" 
                      + ":!:  !:!  :!:  !:!    :!:    :!:  !:!    :!:   \n" 
                      + " ::  :::  ::   :::     ::    ::   :::     ::   \n" 
                      + " :   :::   :   : :     :      :   : :     :    ");
                            
  // Intro to story
  System.out.println( " \n");
                    System.out.println ("Hey there brave user! you are about to resume your relationship with an overly attached girlfried\n");
                    System.out.println ("Her name is Kathy, an angry jealous girl who needs all the attention in this world\n");
                    System.out.println ("Your mission is to keep her calm and happy. Please try to have a good relationship\n");
                    System.out.println ("If you dont.. expect tragic consequences\n");
                    System.out.println ("Also.. she a daddys girl\n");
                    System.out.println ("KATHY WANTS, KATHY GETS!\n");
                    System.out.println ("let me ask you a few questions to try to predict the outcome of this strange relationship\n");
                    System.out.println ("From a scale of 1 - 10 how patient are you?"); 
  
    
    // questions related to game topic to engage user
    howPatient = input.nextInt();
    if (howPatient > 7){
         System.out.println(" \n");
                          System.out.println("Interesting!");
                          System.out.println("You have potential!");
                          System.out.println("Is Marriage the point where life begins or ends?\n");
    }
    // if input is < 7 print this lines    
    else if(howPatient < 7){
      System.out.println(" \n");
                        System.out.println("Psh Good Luck, Kathy is going to drive you crazy!");
                        System.out.println("You better run while you still can");
                        System.out.println("Is marriage the point where life begins or ends?");
    }
      // if input equals to 7 pringt this lines
    else if(howPatient == 7){
        System.out.println(" \n");
                          System.out.println("Lucky Number 7! You can't be too patient. I wish you luck!");
                          System.out.println("Is marriage the point where life begins or ends?");
      }
            
 
    // if answer is ends respond with:
    beginsOrEnds = input.next();
    if (beginsOrEnds.equals("ends")) {
      System.out.println (" \n");
                          System.out.println("Marriage is just a tradition right? seriously who wants to be tied down? as long as two people are together\n");
                          System.out.println("Its best to be free\n");
                          System.out.println("How many relationship partners have you had in your adult life?\n");
                          System.out.println("Be Honest!");
                          
                         
                      
         }
    
    // if answer is begins respond with:
    else if (beginsOrEnds.equals("begins")) {
      System.out.println (" \n");
                          System.out.println("Just like Kathy, You must be ready to tie the knot\n");
                          System.out.println("How many relationship partners have you had in your adult life?\n");
                          System.out.println("Be Honest!");

                      
         }
    
    // if answer is other than begins or ends respond with:
    else{
      System.out.println("before you to resume this starnge relationship\n");
                        System.out.println("how many relationship partners have you had in your adult life?\n");
                        System.out.println("Be Honest!");
      
    }
     //get number of partners from user and assign to numberOfStudents variable declared above
     relationshipPartners = input.nextInt();
    
       //random number   
       randomNum = minimum + (int)(Math.random() * maximum);
     
    // if random number number is greater than 4 respond with:
    if(randomNum > 4){
                         System.out.println("You little devil.. Kathy will calm you down like a neutered dog");
                         System.out.println("Anyways its time for you to resume this strange relationship");
                         System.out.println("Are you ready?");
    }
    
    // if random number is less than or equal to 4 respond with:
    else if (randomNum <= 4){
                         System.out.println("You definitely need more experience");
                         System.out.println("Im freaking out.. This feels like a suicide mission");
                         System.out.println("Anyways its time for you to resume this strange relationship");
                         System.out.println("Are you ready?");
      
    }                    
    
    doYouUnderstand = input.next();
    
    // if answer is yes respond with :
    if (doYouUnderstand.equals("yes")) {
    System.out.println(" \n");
                      System.out.println("Chapter 1\n");
                      System.out.println("Kathy - Hey you! I havent seen you or heard from you in 2 hours\n");
                      System.out.println("Do you really think its ok to just show up like I didnt say anything\n");
                      System.out.println("WHAT IS WRONG WITH YOU!\n");
                      System.out.println("Don't you ever ignore me like this again\n");
                      System.out.println("Do you understand?\n");
                      System.out.println("ANSWER ME! Yes or No!?");
      
    }

    // if answer is no respond with :
    else if (doYouUnderstand.equals("no")) {
    System.out.println(" \n");
                      System.out.println("I thought you were brave! anyway its too late to say no.. sorry!\n");
                      System.out.println("Chapter 1\n");
                      System.out.println("Kathy - Hey you! I havent seen you or heard from you in 2 hours\n");
                      System.out.println("Do you really think its ok to just show up like I didnt say anything\n");
                      System.out.println("WHAT IS WRONG WITH YOU!\n");
                      System.out.println("Don't you ever ignore me like this again\n");
                      System.out.println("Do you understand?\n");
                      System.out.println("Answer me! Yes or No!?");
      
    }
    
    // if answer is other than yes or no respond with :
    else {
      System.out.println(" \n");
                      System.out.println("I'll take that as a yes\n");
                      System.out.println("Chapter 1\n");
                      System.out.println("Kathy - Hey you! I havent seen you or heard from you in 2 hours\n");
                      System.out.println("Do you really think its ok to just show up like I didnt say anything\n");
                      System.out.println("WHAT IS WRONG WITH YOU!\n");
                      System.out.println("Don't you ever ignore me like this again\n");
                      System.out.println("Do you understand?\n");
                      System.out.println("Answer me! Yes or No!?");
    }
    
    
    // if answer is yes respond with :
   yesOrNo = input.next();
    if(yesOrNo.equals("yes")) {
      System.out.println (" \n");
                         System.out.println("Me - It was only 2 Hours!, I was busy but fine ill try my best to respond ASAP\n");
                         System.out.println("Kathy - Yeah! You already know how I get\n");
                         System.out.println("Just for that you have to feed me now\n");
                         System.out.println("I havent had a chance to eat just thinking that you could've been with someone else\n");
                         System.out.println("I could seriously eat an entire cow right now\n" );
                         System.out.println("Where are you taking Kathy out to eat?");
    }
    
   // if answer is no respond with 
    else if(yesOrNo.equals("no")) {
      System.out.println (" \n");
                         System.out.println("Kathy - WHAT!?\n");
                         System.out.println("Angry Kathy waits for the perfect time to snatch your cell phone and locks her self in the restroom\n");
                         System.out.println("15 minutes later kathy gives back the phone\n");
                         System.out.println("Kathy - From now on you're sharing your location with me for the rest of your life\n");
                         System.out.println("There's no hidding now muhhahaha\n");
                         System.out.println("By the way I accidently deleted all your girl contacts from your phone\n");
                         System.out.println("I was just trying to listen to music and I dont know what happened... SORRY! hehe\n");
                         System.out.println("Now take me out to eat! I can seriously eat an entire cow right now.\n");
                         System.out.println("Where are you taking Kathy to eat?");
      
    }
    
    // if answer is other than yes or no respond with :
    else {
     System.out.println(" \n");
                       System.out.println("What do you mean " + yesOrNo + "!?\n");
                       System.out.println("Youre mine now! You do as I say or you will get it from me and my dad\n");
                       System.out.println("Now take me out to eat.. I can eat an entire cow right now!\n");
                       System.out.println("Where are you taking kathy to eat ?");
   }
     
    // if answer is sushi respond with : / spalsh screen game over
    outToEat = input.next();
     if(outToEat.equals("sushi")) {
      System.out.println (" \n");
                          System.out.println("Kathy - I hate Sushi \n");
                          System.out.println("Kathy - I cant be with you! \n");
                          System.out.println("  @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@\n"  
                                             +"@@@@@@@@@  @@@@@@@@  @@@@@@@@@@@  @@@@@@@@\n"
                                             +"!@@        @@!  @@@  @@! @@! @@!  @@!\n"      
                                             +"!@!        !@!  @!@  !@! !@! !@!  !@!\n"       
                                             +"!@! @!@!@  @!@!@!@!  @!! !!@ @!@  @!!!:!\n"    
                                             +"!!! !!@!!  !!!@!!!!  !@!   ! !@!  !!!!!:\n"    
                                             +":!!   !!:  !!:  !!!  !!:     !!:  !!:\n"       
                                             +":!:   !::  :!:  !:!  :!:     :!:  :!:\n"       
                                             +":::: ::::  ::   :::  :::     ::    :: ::::\n"  
                                             +"::: :: :    :   : :   :      :    : :: ::\n"   
                                             +" \n"
                                             +" \n"
                                             +"  @@@@@@   @@@  @@@  @@@@@@@@  @@@@@@@\n"   
                                             +" @@@@@@@@  @@@  @@@  @@@@@@@@  @@@@@@@@\n"  
                                             +" @@!  @@@  @@!  @@@  @@!       @@!  @@@\n"  
                                             +" !@!  @!@  !@!  @!@  !@!       !@!  @!@\n"  
                                             +" @!@  !@!  @!@  !@!  @!!!:!    @!@!!@!\n"   
                                             +" !@!  !!!  !@!  !!!  !!!!!:    !!@!@!\n"    
                                             +" !!:  !!!  :!:  !!:  !!:       !!: :!!\n"   
                                             +" :!:  !:!   ::!!:!   :!:       :!:  !:!\n"  
                                             +" ::::: ::    ::::     :: ::::  ::   :::\n"  
                                             +"  : :  :      :      : :: ::    :   : : "); 
                                             
                                             
    
   }
                          
      // if answer is tacos respond with : / splash screen game over  
     else if(outToEat.equals("tacos")) {
      System.out.println (" \n");
                          System.out.println("Kathy - HELL NO!\n");                     
                          System.out.println("Kathy - Im trying to lose weight here you psycho\n");
                          System.out.println("Kathy - I cant be with you! \n");
                          System.out.println("  @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@\n"  
                                             +"@@@@@@@@@  @@@@@@@@  @@@@@@@@@@@  @@@@@@@@\n"
                                             +"!@@        @@!  @@@  @@! @@! @@!  @@!\n"      
                                             +"!@!        !@!  @!@  !@! !@! !@!  !@!\n"       
                                             +"!@! @!@!@  @!@!@!@!  @!! !!@ @!@  @!!!:!\n"    
                                             +"!!! !!@!!  !!!@!!!!  !@!   ! !@!  !!!!!:\n"    
                                             +":!!   !!:  !!:  !!!  !!:     !!:  !!:\n"       
                                             +":!:   !::  :!:  !:!  :!:     :!:  :!:\n"       
                                             +":::: ::::  ::   :::  :::     ::    :: ::::\n"  
                                             +"::: :: :    :   : :   :      :    : :: ::\n"   
                                             +" \n"
                                             +" \n"
                                             +"  @@@@@@   @@@  @@@  @@@@@@@@  @@@@@@@\n"   
                                             +" @@@@@@@@  @@@  @@@  @@@@@@@@  @@@@@@@@\n"  
                                             +" @@!  @@@  @@!  @@@  @@!       @@!  @@@\n"  
                                             +" !@!  @!@  !@!  @!@  !@!       !@!  @!@\n"  
                                             +" @!@  !@!  @!@  !@!  @!!!:!    @!@!!@!\n"   
                                             +" !@!  !!!  !@!  !!!  !!!!!:    !!@!@!\n"    
                                             +" !!:  !!!  :!:  !!:  !!:       !!: :!!\n"   
                                             +" :!:  !:!   ::!!:!   :!:       :!:  !:!\n"  
                                             +" ::::: ::    ::::     :: ::::  ::   :::\n"  
                                             +"  : :  :      :      : :: ::    :   : : "); 
                                             
                                             


       
     }
    
     // any answer will result in end of game with splash screen game over
      else {
     System.out.println(" \n");
                          System.out.println("Kathy - Hell No! I hate " + outToEat + ", You suck at choosing places.\n");
                          System.out.println("Kathy - I was joking about eating an entire cow!\n");
                          System.out.println("Kathy - I cant be with you! \n");
                          System.out.println("  @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@\n"  
                                             +"@@@@@@@@@  @@@@@@@@  @@@@@@@@@@@  @@@@@@@@\n"
                                             +"!@@        @@!  @@@  @@! @@! @@!  @@!\n"      
                                             +"!@!        !@!  @!@  !@! !@! !@!  !@!\n"       
                                             +"!@! @!@!@  @!@!@!@!  @!! !!@ @!@  @!!!:!\n"    
                                             +"!!! !!@!!  !!!@!!!!  !@!   ! !@!  !!!!!:\n"    
                                             +":!!   !!:  !!:  !!!  !!:     !!:  !!:\n"       
                                             +":!:   !::  :!:  !:!  :!:     :!:  :!:\n"       
                                             +":::: ::::  ::   :::  :::     ::    :: ::::\n"  
                                             +"::: :: :    :   : :   :      :    : :: ::\n"   
                                             +" \n"
                                             +" \n"
                                             +"  @@@@@@   @@@  @@@  @@@@@@@@  @@@@@@@\n"   
                                             +" @@@@@@@@  @@@  @@@  @@@@@@@@  @@@@@@@@\n"  
                                             +" @@!  @@@  @@!  @@@  @@!       @@!  @@@\n"  
                                             +" !@!  @!@  !@!  @!@  !@!       !@!  @!@\n"  
                                             +" @!@  !@!  @!@  !@!  @!!!:!    @!@!!@!\n"   
                                             +" !@!  !!!  !@!  !!!  !!!!!:    !!@!@!\n"    
                                             +" !!:  !!!  :!:  !!:  !!:       !!: :!!\n"   
                                             +" :!:  !:!   ::!!:!   :!:       :!:  !:!\n"  
                                             +" ::::: ::    ::::     :: ::::  ::   :::\n"  
                                             +"  : :  :      :      : :: ::    :   : : "); 
                                             
                                           

      }
    
   
    } // end of main method
  }  // end of application 

                         