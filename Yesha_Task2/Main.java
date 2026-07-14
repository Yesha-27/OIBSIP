package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char playAgain;

        System.out.println("\n\t===== NUMBER GUESSING GAME =====");

        do {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 5;
            int score = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between 1 to 100.");
            System.out.println("You have " + attempts + " attempts to guess it.");

            while (attempts > 0) {

                System.out.print("\nGuess the Number: ");
                int guess = sc.nextInt();

                if (guess == randomNumber) {
                    guessedCorrectly = true;

                    System.out.println("\n🎉 Congratulations!");
                    System.out.println("You guessed the correct number.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("GREATER THAN "+ guess);
                } else {
                    System.out.println("SMALLER THAN "+guess);
                }

                attempts--;

                if (attempts > 0) {
                    System.out.println("Attempts Left: " + attempts);
                }
            }

            if (!guessedCorrectly) {
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + randomNumber);
            }

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\nThank you for playing!");
        sc.close();
    }
}