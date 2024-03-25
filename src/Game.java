import javax.swing.text.Style;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public Game() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int num = rand.nextInt(100);
        int tries = 0;

        System.out.println("\nWelcome to the peak of entertainment - The Guessing Game!");
        System.out.println("Kindly enter your name:");
        String username = scan.nextLine();

        boolean guessed = false;
        while (!guessed) {
            System.out.println("\nEnter your guess:");
            System.out.println(num);
            int guessedNum;
            try {
                guessedNum = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("\nInvalid Input!");
                continue;
            }
            if (guessedNum > 100 || guessedNum < 1) {
                System.out.println(guessedNum + " Is an invalid number!");
            } else if (guessedNum == num) {
                System.out.println("Congratulations, " + username + " you guessed it correctly! It took you:" + tries + " tries");
                guessed = true;
            } else if (num > guessedNum) {
                System.out.println("Your guess is too low!");
            } else {
                System.out.println("Your guess is too high!");
            }
            tries += 1;
        }
    }
}
