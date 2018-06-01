/* 
Omar Estevez
CoSci290
2/21/18

Homework Assignment 1 

FYI Proffessor Tuy We Decided to chage the game topic from space horror to Dating SIM.


*/

import java.util.Scanner;

public class GameDriver3 {
  
 // Start of Application
  public static void main(String [] args){
   
     //variable declarations with default values
    Scanner input = new Scanner (System.in);  //initialize Scanner for user input
    int relationshipPartners = 0;
    int randomNum = 0;
    int minimum = 1; //set min for range for random numbers
    int maximum = 10; //set max for range for random numbers
    int howPatient;
    int whatStation;
    String beginsOrEnds;
    String doYouUnderstand;
    String yesOrNo;
    String outToEat;
    String toDrink;
    String toLook;


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
           
    else if(howPatient < 7){
      System.out.println(" \n");
                        System.out.println("Psh Good Luck, Kathy is going to drive you crazy!");
                        System.out.println("You better run while you still can");
                        System.out.println("Is marriage the point where life begins or ends?");
    }
      
    else if(howPatient == 7){
        System.out.println(" \n");
                          System.out.println("Lucky Number 7! You can't be too patient. I wish you luck!");
                          System.out.println("Is marriage the point where life begins or ends?");
      }
            
    
    
    beginsOrEnds = input.next();
    if (beginsOrEnds.equals("ends")) {
      System.out.println (" \n");
                          System.out.println("Marriage is just a tradition right? seriously who wants to be tied down? as long as two people are together\n");
                          System.out.println("Its best to be free\n");
                          System.out.println("How many relationship partners have you had in your adult life?\n");
                          System.out.println("Be Honest!");
                          
                         
                      
         }
    
    else if (beginsOrEnds.equals("begins")) {
      System.out.println (" \n");
                          System.out.println("Just like Kathy, You must be ready to tie the knot\n");
                          System.out.println("How many relationship partners have you had in your adult life?\n");
                          System.out.println("Be Honest!");

                      
         }
    
    else{
      System.out.println("before you to resume this starnge relationship\n");
                        System.out.println("how many relationship partners have you had in your adult life?\n");
                        System.out.println("Be Honest!");
      
    }
    
     relationshipPartners = input.nextInt(); //get number of partners from user and assign to numberOfStudents variable declared above
    
       randomNum = minimum + (int)(Math.random() * maximum);
      
    if(randomNum > 4){
                         System.out.println("You little devil.. Kathy will calm you down like a neutered dog");
                         System.out.println("Anyways its time for you to resume this strange relationship");
                         System.out.println("Are you ready?");
    }
    else if (randomNum <= 4){
                         System.out.println("You definitely need more experience");
                         System.out.println("Im freaking out.. This feels like a suicide mission");
                         System.out.println("Anyways its time for you to resume this strange relationship");
                         System.out.println("Are you ready?");
      
    }                    
    
    doYouUnderstand = input.next();
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
    
    else {
     System.out.println(" \n");
                       System.out.println("What do you mean " + yesOrNo + "!?\n");
                       System.out.println("Youre mine now! You do as I say or you will get it from me and my dad\n");
                       System.out.println("Now take me out to eat.. I can eat an entire cow right now!\n");
                       System.out.println("Where are you taking kathy to eat ?");
   }
                
    outToEat = input.next();
     if(outToEat.equals("sushi")) {
      System.out.println (" \n");
                         System.out.println("Kathy - OMG! YES! I LOVE SUSHI! NOM NOM NOM \n");
                         System.out.println("Kathy - All you can eat IKURA!!!\n");
                         System.out.println("You both get in the car and head out to the sushi bar\n");
                         System.out.println("out of 5 preset stations type the number of the radio station you want to listen to");
    
   }
                          
       
     else if(outToEat.equals("tacos")) {
      System.out.println (" \n");
                         System.out.println("Kathy - HELL NO!\n");                     
                         System.out.println("Kathy - Im trying to lose weight here you psycho\n");
                         System.out.println("I was just kidding about eating an entire cow\n");
                         System.out.println("Kathy - We're eating good sushi, I know you just got paid.\n");
                         System.out.println("You both get in the car and head out to the sushi bar\n");
                         System.out.println("out of 5 preset stations type the number of the radio station you want to listen to");
       
     }
               // adding users response to println
      else {
     System.out.println(" \n");
                       System.out.println("Kathy - Hell No! I hate " + outToEat + ", You suck at choosing places.\n");
                       System.out.println("Kathy - I was joking about eating an entire cow!\n");
                       System.out.println("Kathy - We're eating good sushi!, I know you just got paid.\n");
                       System.out.println("You both get in the car and head out to the sushi bar\n");
                       System.out.println("out of 5 preset stations type the number of the radio station you want to listen to");
        
      }
    
     whatStation = input.nextInt();
      if(whatStation < 4) {
                          System.out.println(" \n");
                          System.out.println("93.1 Jack FM, Playing what we want..\n");
                          System.out.println("Arrived at sushi bar\n");
                          System.out.println("Irasshai-mase\n");
                          System.out.println("What would you like to drink?\n");
                          System.out.println("Beer or Sake?");
                         
      }
    
      else if(whatStation == 4) {
                          System.out.println (" \n");
                          System.out.println("94.7 The waaaaave.. Playing Sade - No Ordinary Love");
                          System.out.println("Kathy - This is no ordinary love baby, I gotta keep things interesting.");
                          System.out.println("Arrived at sushi bar\n");
                          System.out.println("Irasshai-mase\n");
                          System.out.println("What would you like to drink?\n");
                          System.out.println(" Beer or Sake?");
                         
       }
    
         else if (whatStation == 5) {
                        System.out.println(" \n");
                        System.out.println("95.5 KLOS playing Marylin Manson - Personal Jesus");
                        System.out.println("Kathy - I love this song!\n");
                        System.out.println("Arrived at sushi bar\n");
                        System.out.println("Irasshai-mase\n");
                        System.out.println("Pretty waitress - What would you like to drink?\n");
                        System.out.println(" Beer or Sake?");
      
    }
    
                    else{
                        System.out.println("Kathy - Lets just listen to KROQ - She wants revenge Playing");
                        System.out.println("Kathy - I love this song!\n");
                        System.out.println("Arrived at sushi bar\n");
                        System.out.println("Irasshai-mase\n");
                        System.out.println("Pretty waitress - What would you like to drink?\n");
                        System.out.println(" Beer or Sake?");
      
    }
    
    
    toDrink = input.next();
    if (toDrink.equals("beer")){
      System.out.println ("\n");
                          System.out.println("Chapter 2\n");
                          System.out.println("Kathy - I'll have a glass of water\n");
                          System.out.println("Pretty waitress - sure an Orion beer and a glass of water coming right up!\n");
                          System.out.println("Kathy - Can you stop looking at her! you're here with me!\n");
                          System.out.println("Me - All I did was order a drink!\n");
                          System.out.println("Kathy - I dont care.. She smiled at you.. I dont want you looking at her ok?\n");
                          System.out.println("Dare to look?");
      
   
    }
    
    // Game over splash screens 
    else if(toDrink.equals("sake")){
                          System.out.println("Kathy - I cant be with an alcoholic!");
                          System.out.println("kathy gets up and takes an uber home");
                          System.out.println("You lost her!");
                          System.out.println("I was expecting something more from someone thats been in " + relationshipPartners + " mature relationships\n");
                          System.out.println(" \n");
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
    
                        else{
                          System.out.println("Pretty waitress - Im sorry we dont serve " + toDrink + " \n" );
                          System.out.println("Kathy - How can you guys not serve that here!\n");
                          System.out.println("Kathy went crazy\n");
                          System.out.println("Next time look at the menu before you order");
                          System.out.println("I was expecting something more from someone thats been in " + relationshipPartners + " mature relationships\n");
                          System.out.println(" \n");
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
        
    
     toLook = input.next();
     if (toLook.equals("yes")) {
      System.out.println(" \n");
                         System.out.println("Pretty waitress looks at you and smiles -  Here's your beer\n");
                         System.out.println("You look back - Thank you!\n");
                         System.out.println("Kathy Furious gets her drink and throws it at the waitress\n");
                         System.out.println("Kathy slaps you and takes an Uber Home\n");
                         System.out.println("What Kathy Wants, Kathy Gets!\n");
                         System.out.println("I was expecting something more from someone thats been in " + relationshipPartners + " mature relationships\n");
                         System.out.println( "  @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@\n"  
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
    
    
                      else if(toLook.equals("no")) {
                         System.out.println ("You are the perfect match!\n");
                         System.out.println ("Congratulations you proved yourslef worthy\n"); 
                         System.out.println( "  @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@\n"  
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
    
                       else{
                         System.out.println("You should have typed yes or no!, not" + toLook + " \n");
                         System.out.println("I was expecting something more from someone thats been in " + relationshipPartners + " mature relationships\n");
                         System.out.println( "  @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@\n"  
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
    
  
    }
  }
} // end of application 
    
 