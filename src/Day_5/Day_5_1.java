package Day_5;

public class Day_5_1{
    public static void main(String[] args) {
        System.out.println("SQUARE PATTERN:");

        int size = 5; // The number of rows and columns

        // Outer loop to handle the rows
        for (int i = 1; i <= size; i++) {

            // Inner loop to handle the columns
            // For each row, this loop prints 'size' number of stars
            for (int j = 1; j <= size; j++) {
                System.out.print("* "); // Print a star and a space
            }
            System.out.println();
        }
    }
}