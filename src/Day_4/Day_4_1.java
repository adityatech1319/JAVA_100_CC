package Day_4;

public class Day_4_1 {

    public static void printFibonacciSequence(int count) {
        int n1 = 0, n2 = 1;

        System.out.print("Fibonacci Series of " + count + " terms: ");

        for (int i = 1; i <= count; ++i) {
            System.out.print(n1 + " ");

            int sumOfPrevTwo = n1 + n2;
            n1 = n2;
            n2 = sumOfPrevTwo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numberOfTerms = 12;
        printFibonacciSequence(numberOfTerms);
    }
}