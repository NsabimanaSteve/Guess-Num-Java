import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int secretNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I’m thinking of a number between 1 and 100. Can you guess it?");

        // Initialize variables
        int guess = 0;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (guess != secretNumber) {
            System.out.print("Guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Good try, but that’s too low. Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Good try, but that’s too high. Try again.");
            }
        }

        System.out.println("Yes! You guessed correctly after " + attempts + " tries! Congratulations.");

        // Close the scanner
        scanner.close();
    }
}
