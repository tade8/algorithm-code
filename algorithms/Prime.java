package algorithms;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        input.nextInt();

        int i = 2;

        if (i % 2 == 0)
            System.out.println(false);
        else
            System.out.println(true);
        i++;

    }
}
