package algorithms;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        int count = 1;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        while (count < 6){
            System.out.println("Enter grade: ");
            int grades = input2.nextInt();
            String studentName = input3.next();
            count++;

            switch (grades/10) {
                case 9,10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            }
        }

        System.out.println("The results of the grades:");
        System.out.printf("%s %s%d%n%s %s%d%n%s %s%d%n%s %s%d%n%s %s%d%n",
                "A: ", aCount);
    }
}
