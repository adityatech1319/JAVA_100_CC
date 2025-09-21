package Day_5;

public class Day_5 {
    public static void main(String[] args) {
        System.out.println("PYRAMID TRIANGLE:");

        int rows = 5;


        for (int i = 1; i <= rows; i++) {

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}