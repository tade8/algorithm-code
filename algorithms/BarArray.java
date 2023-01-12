package algorithms;

import java.util.Scanner;

public class BarArray {
    public static void main(String[] args) {
        int integer = 0;
        Scanner input1 = new Scanner(System.in);

        for (int count = 1; count <= 5; count++) {
            System.out.print("Enter a number between 1 and 30: ");
            integer = input1.nextInt();

            for (int i = 1; i <= integer; i++) {
                if (integer < 31) {
                    System.out.printf("%s", "*");
                } else {
                    System.out.println("Number must be between 1 and 30");
                }
            }
            System.out.println();

        }
    }
}
