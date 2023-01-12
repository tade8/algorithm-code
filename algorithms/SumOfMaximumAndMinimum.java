package algorithms;

import java.util.Scanner;

public class SumOfMaximumAndMinimum {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        int maximum = 0;
        int minimum = 0;

        for (int num = 1; num <= 5; num++) {
            System.out.print("Enter integer: ");
            int value = numInput.nextInt();

            if (value > maximum) {
                maximum = value;
            }

            if (value < minimum) {
                minimum = value;
            }

        }
        System.out.printf("Maximum: %d%n", maximum);
        System.out.printf("Minimum: %d%n", minimum);

        System.out.printf("Sum of extremes: %d%n", maximum + minimum);
    }
}
