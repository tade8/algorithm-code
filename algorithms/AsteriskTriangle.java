package algorithms;

import java.util.Scanner;

public class AsteriskTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any length: ");
        int length = input.nextInt();

        for (int row = 1; row <= length; row++) {
            for (int col = length; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
