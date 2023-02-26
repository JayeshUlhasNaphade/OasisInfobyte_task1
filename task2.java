/********************************************************************
  
                        OASIS INFOBYTE
                  JAVA DEVELOPMENT INTERNSHIP
                        JAYESH NAPHADE
                TASK #2 :- NUMBER GUESSING GAME
                
*********************************************************************/

import java.util.*;
  

public class task2{

      public static void Guess(int x,int y,int i){
            if(y==x){
                  System.out.println("Congratulations you won this game in "+i+" Chance");
                  System.exit(i);
            }
            else if(y>x){
                  System.out.println("The Computer number is greater");
            }else{
                  System.out.println("The Computer number is smaller");
            }
      }
      

      public static void main(String[] args) {
            System.out.println("*********WELCOME TO NUMBER GUESSING GAME*********");
            Random r = new Random();
            int randomNo = r.nextInt(100);


            Scanner sc = new Scanner(System.in);
            System.out.println("LETS CHECK YOUR CONFIDENCE!!");
            System.out.println("HOW MANY CHANCE YOU NEED TO GUESS THE NUMBER!!");
            int n = sc.nextInt();

            for(int i=1 ;i<=n; i++){
                  int remaining = n-i;
                  System.out.println();
                  System.out.println("Enter the number for "+i+" chance and you have " + remaining+" Chances remaining");
                  int num = sc.nextInt();

                  Guess(num,randomNo,i);


            }
            
            System.out.println("Opps! You lost the Game");
            System.out.println("The computer number was :"+randomNo);
            

      }
}

