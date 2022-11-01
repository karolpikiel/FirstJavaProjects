
import java.util.Scanner;
public class NumberGame {


public static void  main(String [] args) {
    int randomNumber = (int) (Math.random() * 100) + 1;
    boolean hasWon = false;

    System.out.println("I have randomly chosen a number from 1 to 100");
    System.out.println("Try to guess it");

    Scanner scanner = new Scanner(System.in);
    int guess;
    for (int i = 10; i > 0; i--) {
        System.out.println("You have " + i + " trys left. Choose one more time.");
        guess = scanner.nextInt();
        System.out.println("Your guess was " + guess);

        if (randomNumber < guess) {
            System.out.println("The random number is lower than your guess.");
        }
        else if (randomNumber > guess) {
            System.out.println("The random number is higher than your guess.");
        }
        else  {
            hasWon = true;
            break;
        }
    }
    if (hasWon){
    System.out.println("You have won!");}
    else {
        System.out.println("Game over");
        System.out.println("Number was " + randomNumber);
    }
    }

}





