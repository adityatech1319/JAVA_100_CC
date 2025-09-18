package Day_2;
import java.util.Scanner;
import java.io.*;
//converting int to binary datatype
public class Day_2 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER A NUMBER :");
        int num = obj.nextInt();
        System.out.println("BINARY IS :"+ Integer.toBinaryString(num));
    }
}
