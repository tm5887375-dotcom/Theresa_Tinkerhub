import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Guessing_Number_Game
{
   
        private static int timeUp=0;
        public static void main(String args[])
        { 
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your name");
            String name=sc.nextLine();
            System.out.println(" WELCOME TO TIMED GUESSING GAME"+ " "+name);
            System.out.println("Select difficulty level");
            System.out.println("LEVEL 1:A SECRET NUMBER BETWEEN 1 TO 50   LEVEL 2: A SECRET NUMBER BETWEEN 1 TO 100");
            System.out.println("Enter preferred level(Either 1 or 2)");
            int prefer=sc.nextInt();
            int numberToGuess;
            int guess;
        if(prefer==1)
        { 
            numberToGuess=15;
            
        }
        else
        {
            numberToGuess=76;
        }
        System.out.println("YOU HAVE 1 MINUTE TO GUESS.. SO GET SET GO!!!");
        Timer timer=new Timer();
        timer.schedule(new TimerTask()
        {
            public void run()
            {
                timeUp=1;
                System.out.println("TIMES UP!!  YOU TOOK TOO LONG");
                System.out.println("CORRECT NUMBER WAS="+" "+numberToGuess);
                System.exit(0);
            }
        },60000); // 60 seconds
        while(timeUp!=1)
        {
               System.out.println("ENTER YOUR GUESS");
               guess=sc.nextInt();
               if(guess>numberToGuess)
               {
                   
                   System.out.println("You are too HIGHHH");
               }
               if(guess<numberToGuess)
               {
                   System.out.println("You are too LOWW");
               }
                        
               if(guess==numberToGuess)
               {
                   System.out.println("WOHOO YOU GUESSED IT RIGHT!!");
                   timer.cancel();  //stop timer
                   break;
                          
               }
                            
        }
    }
}
    



                        
                        
                        
                        
                    
                    
                    
                
            
        
        
        
        
            
            
          
                        
                    
                    
                    
                
            
        
            
        
        
        
        
        