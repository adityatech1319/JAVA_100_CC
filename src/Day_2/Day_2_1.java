package Day_2;

import java.util.Scanner;

public class Day_2_1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER A NON-NEGATIVE NUMBER TO FIND FACTORIAL: ");
        int num = obj.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial is " + factorial(num));
        }
        obj.close();
    }

    static int factorial(int n) {

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}