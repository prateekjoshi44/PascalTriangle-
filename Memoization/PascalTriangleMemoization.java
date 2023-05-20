import java.util.HashMap;
import java.util.Map;

public class PascalTriangleMemoization {
    public static void main(String[] args) {
        int rows = 5; // Number of rows to print

        printtriangle(rows);
    }

    public static void printtriangle(int rows) {
        Map<String, Integer> memo = new HashMap<>();  //declaring memo variable to store prev same values (as key value pair)
        
        for (int i = 0; i < rows; i++) {
            // Printing spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Print the values of the row
            for (int j = 0; j <= i; j++) {
                int num = Pascalvalue(i, j, memo); //calling pascalvalue function again
                System.out.print(num + " ");
            }

            System.out.println(); //next line
        }
    }

    public static int Pascalvalue(int row, int col, Map<String, Integer> memo) {
        String key = row + "," + col; //creating unique key for each element
        
        // Check if the value is already stored in memo
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Base case: if col is 0 or=row, the value = 1
        if (col == 0 || col == row) {
            return 1;
        }

        //  calculate the value based on the previous row using Recursion
        int num1 = Pascalvalue(row - 1, col - 1, memo);
        int num2 = Pascalvalue(row - 1, col, memo);
        int result = num1 + num2;
        
        // putting value to memo for future use
        memo.put(key, result);
        
        return result;
    }
}
