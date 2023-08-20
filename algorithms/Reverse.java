package algorithms;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        int number; int reverse = 0;
        int remainder;

        Scanner input4 = new Scanner(System.in);

        System.out.println("Enter a five digit integer: ");
        number = input4.nextInt();

        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.printf("The reverse of %d is: %d%n",
                number, reverse);
    }
}
