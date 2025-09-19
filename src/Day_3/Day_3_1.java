package Day_3;
//simple interest progam
import java.util.Scanner;

public class Day_3_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();


        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();


        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();


        double simpleInterest = (principal * rate * time) / 100;

        // Print the calculated simple interest
        System.out.println("The Simple Interest is: " + simpleInterest);


        scanner.close();
    }
}