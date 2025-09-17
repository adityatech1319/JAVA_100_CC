package Day_1;
//swapping two numbers;
import java.util.Scanner;

public class Day_1_2 {
    public static void main(String [] args ){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int a = obj.nextInt();
        System.out.println("Enter number 2 : ");
        int b = obj.nextInt();
        System.out.println("BEFORE SWAPPING");
        System.out.println("A is "+ a);
        System.out.println("B is "+ b);
        a = a+b;
        b = a-b;
        a = a - b ;
        System.out.println("AFTER SWAPPING");
        System.out.println("A is "+ a);
        System.out.println("B is "+ b);
    }
}
