package Day_4;

import java.util.ArrayList;
import java.util.List;

public class Day_4 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(sum);
            }

            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        Day_4 pt = new Day_4();
        int numberOfRows = 7;
        List<List<Integer>> result = pt.generate(numberOfRows);

        for (List<Integer> row : result) {
            for (int i = 0; i < numberOfRows - row.size(); i++) {
                System.out.print(" ");
            }
            for (Integer number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}