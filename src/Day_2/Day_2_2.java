package Day_2;
//factorial using loop
import java.util.Scanner;

public class Day_2_2 {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number to find Factorial :");
        int num = obj.nextInt();
        int fact = 1;
        if(num>=1){
        while (num >1){
            fact *= num ;
            num--;
        }
        System.out.println("Factorial is : "+ fact);}
        else {
            System.out.println("ENTER A NON NEGATIVE NUMBER !");
        }
        obj.close();
    }
}
