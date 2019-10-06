package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);

        class GuessMovie{
            String moviee;
            public String movie(String moviee){
                String finalMovie="";
                System.out.println("HINT---The movie contains "+moviee.length()+" letters");
                for(int i=0 ; i<moviee.length() ;i++){
                    System.out.println("guess the letter");
                char letter=sc.next().charAt(0);
                    if(moviee.charAt(i)==letter){
                        finalMovie+=letter;
                     //   System.out.println(("Test       "+finalMovie));
                    }
                 else{
                     System.out.println("you guessed it wrong");
                        finalMovie+=letter;

                        continue;
                    }
                }
               return finalMovie;

            }

        }
        String movieIs = "welcome";
        GuessMovie movieName=new GuessMovie();
       String finalOne= movieName.movie(movieIs);
       //System.out.println("Test         "+finalOne);
       if(finalOne.equals(movieIs)){
           System.out.println("congrats! you guessed  " +finalOne+ " movie correctly");
       }
       else{
           System.out.println("oops! you lost "+finalOne+" is not the correct movie");
       }

    }
}
