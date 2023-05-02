import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // generate a random number between 1 and 100
        int numberOfGuesses = 0;
        int guess;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Guess higher.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Guess lower.");
            }
        } while (guess != numberToGuess);

        System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
    }
}
