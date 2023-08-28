import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 5;
        int attempts = 0;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly!");
                System.out.println("You used " + attempts + " attempts.");
                break;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've used all your attempts. The correct number was " + secretNumber + ".");
        }

        scanner.close();
    }
}
