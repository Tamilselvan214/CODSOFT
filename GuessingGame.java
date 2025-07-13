import java.util.*;
public class GuessingGame {
    public static void main(String[] args){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts =10;
        int attemptTook=0;
        int randomNumber=rd.nextInt(1,101);
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess any number between 1 and 100: ");
        do{
            System.out.println("Enter your Guess: ");
            guess = sc.nextInt();
            attemptTook++;
            attempts--;
            if(guess < randomNumber){
                System.out.println("Your Guess is TOO LOW!");
                System.out.println("You've "+attempts+" attempt(s) left");
            }else if(guess > randomNumber){
                System.out.println("Your guess is TOO HIGH!");
                System.out.println("You've "+attempts+" attempt(s) left");
            }else{
                System.out.println("You've Guessed it!!!, The number was "+randomNumber);
                System.out.println("You took "+attemptTook+" attempts...");
            }
        }while(guess != randomNumber && attempts > 0);
        if(attempts == 0){
            System.out.println("Try Again Later!");
        }
        sc.close();
    }
}
