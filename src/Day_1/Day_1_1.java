package Day_1;
//sum of two numbers
import java.util.Scanner;

public class Day_1_1 {
    public static void main (String [] args ){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        int num1 = obj.nextInt();
        System.out.println("Enter the number 2 :");
        int num2 = obj.nextInt();
        System.out.println("SUM OF TWO NUMBERS IS : "+ (num1+num2));
    }
}
