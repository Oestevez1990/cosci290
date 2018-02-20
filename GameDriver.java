/* 
Omar Estevez
CoSci290
2/15/18

Homework Assignment 1 

*/

import java.util.Scanner;

public class GameDriver {

  public static void main(String [] args){
   
    
    Scanner input = new Scanner (System.in);
    int howPatient = 0;
    String doYouUnderstand;
    String yesOrNo;
    String outToEat;
    String youKnowMe;
    String thingsOut;


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
                            
 
  System.out.println( "Welcome brave user! you are now entering a relationship with an overly attached girlfried\n"
                    + "Kathy is an angry jealous girl who needs all the attention in this World\n"
                    + "Your mission is to keep her calm and happy. Please try to have a good relationship\n"
                    + "If you dont.. expect tragic consequences\n"
                    + "Also.. she a daddys girl\n"
                    + "KATHY WANTS, KATHY GETS!\n"
                    + " \n"
                    + "let me ask you a few questions"
                    + "From 1 - 10 how patient are you?"); 
    
    howPatient = input.nextInt();
    if (howPatient > 7){
         System.out.println("Interesting!\n"
                          + "You have potential!\n"
                          + " \n"
                          + " Is Marriage the point where life begins or ends?");
    }
           
    else if(howPatient <= 7){
      System.out.println("Psh Good Luck, Kathy is going to drive you crazy!\n"
                        + "You better run while you still can.\n"
                        + "One more question: Is marriage the point where life begins or ends?");
    }
    
    String beginsOrEnds;
    beginsOrEnds = input.next();
    if (beginsOrEnds.equals("ends")) {
      System.out.println ("Marriage is just a tradition right? seriously who wants to be tied down? as long as two people are together\n"
                          + "Its best to be free\n"
                          + " \n"
                          + "Anyways its time for you to resume this strange relationship\n"
                          + " \n"
                          + " Are you ready?");
                      
         }
    
    else if (beginsOrEnds.equals("begins")) {
      System.out.println ("Just like Kathy, You must be ready to tie the knot\n"
                          + " \n"
                          + "Anyways its time for you to resume this strange relationship\n"
                          + " \n"
                          + " Are you ready?");
                      
         }
    
    
    
    doYouUnderstand = input.next();
    if (doYouUnderstand.equals("yes")) {
    System.out.println("Kathy - Hey you! I havent seen you or heard from you in 2 hours\n"
                      +("and you think its ok to just show up like I didnt say anything\n")
                      + "WHAT IS WRONG WITH YOU!\n"
                      + "Don't you ever ignore me like this again\n"
                      + "Do you understand?\n"
                      + "Yes or No?");
      
    }

    else if (doYouUnderstand.equals("no")) {
    System.out.println("Thats to bad!\n"
                      + "Kathy - Hey you! I havent seen you or heard from you in 2 hours\n"
                      +("and you think its ok to just show up like I didnt say anything\n")
                      + "WHAT IS WRONG WITH YOU!\n"
                      + "Don't you ever ignore me like this again\n"
                      + "Do you understand?\n"
                      + "Yes or No?");
      
    }
    
    else {
      System.out.println("I'll take that as a yes\n"
                      + "Kathy - Hey you! I havent seen you or heard from you in 2 hours\n"
                      +("and you think its ok to just show up like I didnt say anything\n")
                      + "WHAT IS WRONG WITH YOU!\n"
                      + "Don't you ever ignore me like this again\n"
                      + "Do you understand?\n"
                      + "Yes or No?");
    }
    
    
    
   yesOrNo = input.next();
    if(yesOrNo.equals("yes")) {
      System.out.println ("Me - It was only 2 Hours!, I was busy but fine ill try my best to respond ASAP\n"
                         + "Kathy - Yeah! You already know how I get\n"
                         + "just for that you have to feed me now\n"
                         + "I havent had a chance to eat just thinking that you couldve been with someone else\n"
                         + "Where are you going to take Kathy out to eat?");
    }
    
   
    else if(yesOrNo.equals("no")) {
      System.out.println ("Kathy - WHAT!?\n"
                         + "Angry Kathy waits for the perfect time to snatch your cell phone and locks her self in the restroom\n"
                         + "15 minutes later kathy gives back the phone\n"
                         + "Kathy - From now on you're sharing your location with me for the rest of your life\n"
                         + "There's no hidding now hahaha\n"
                         + "By the way I accidently deleted all your girl contacts from your phone\n"
                         + "I was just trying to listen to music... SORRY! hehe\n"
                         + "Now take me out to eat!\n"
                         + " \n"
                         + "Where are you taking Kathy to eat?");
      
    }
    
    else {
     System.out.println("Youre mine now You do as I say or you will get it from me and my dad\n"
                       + "Now take me out to eat.. I can eat an entire cow right now!\n"
                       + "Where are you taking kathy to eat ?");
   }
                
    outToEat = input.next();
     if(outToEat.equals("sushi")) {
      System.out.println ("Kathy - OMG! YES! I LOVE SUSHI! YUM YUM YUM\n"
                         + "Kathy - All you can eat IKURA!!!\n"
                         + "Kathy - You think you know me huh?");
    
   }
                          
       
     else if(outToEat.equals("tacos")) {
      System.out.println ("Kathy - HELL NO!\n"                     
                         + " Kathy - Im trying to lose weight here you psycho\n"
                         + " Kathy - We're eating good sushi, I know you just got paid.\n"
                         + " Kathy - Dont you think that you should know me by now?");
       
     }
    
      else{
     System.out.println("Kathy - OMG! I was joking about eating an entire cow!\n"
                       + "Kathy - You take everything so serious!\n"
                       + "Dont you think that you should know me by now?");
   
      }
    
     youKnowMe = input.next();
      if(youKnowMe.equals("yes")) {
       System.out.println("Me - I do know you, I just like to play around sometimes\n"
                      + "Kathy - You dont play around with me\n"
                      + "Me - You know what Kathy I am done with you\n"
                      + " You pay for the bill and leave\n" 
                      + "*Strike* Angry kathy shows up at your house yelling at you for leaving. She wants you back!\n"
                      + "Do you want to work things out?");
      }
    
      else if(youKnowMe.equals("no")) {
      System.out.println ("Me - ofcourse not theres so much more I need to know about you\n"                     
                         + " Kathy - Thats right! \n"
                         + " Kathy - Im not gonna lie youre really patient.\n"
                         + " Me - Just trying my best");                     
     
       }
    
    
    thingsOut = input.next();
    if (thingsOut.equals("yes")) {
      System.out.println ("You better!");
   
    }
    
    else if (thingsOut.equals("no")) {
      System.out.println("Game Over!");
      
    }
    
    
    else if(youKnowMe.equals("no")) {
      System.out.println ("Me - ofcourse not theres so much more I need to know about you\n"                     
                         + " Kathy - Thats right! \n"
                         + " Kathy - Im not gonna lie youre really patient.\n"
                         + " Me - Just trying my best");                     
     
       }
    
  
  }
}    
 