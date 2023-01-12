package algorithms;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int number = 1 + random.nextInt(10);

        System.out.println("Guess a number between 1 and 10: ");

        while (input.hasNextInt()) {
            int guess = input.nextInt();

            if (guess == number) {
                System.out.println("Congratulations. You guessed the number!");
                System.out.println("Aha! You know the secret!");
                System.out.println("Do you want to play again?" +
                        "\nEnter another guess to continue or press Ctrl D to stop");
            }
            else if (guess > number) {
                System.out.println("Too High. Try Again.");
            }
            else System.out.println("Too Low. Try Again.");

        }
    }
}
