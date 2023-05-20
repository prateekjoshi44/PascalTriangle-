public class PascalTriangleRecursion {
    public static void main(String[] args) {
        int rows = 5; // Number of rows print
        printTriangle(rows);
    }

    public static void printTriangle(int rows) {
        // Iterate over each row!!
        for (int i = 0; i < rows; i++) {
            // Printing spaces!!!
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Print the values of the row!!
            for (int j = 0; j <= i; j++) {
                int num = calculatePascalValue(i, j);
                System.out.print(num + " ");
            }

            System.out.println(); // Move to the next line for the next row..!
        }
    }

    public static int calculatePascalValue(int row, int col) {
        // Base case: if col = 0 or = row, the value is 1...
        if (col == 0 || col == row) {
            return 1;
        }
            //                 1
            //             1       1
            //         1       2       1       
            //     1       3       3       1
            // 1       4       6       4       1
        // calculating the values based on the previous row values.....
        int num1 = calculatePascalValue(row - 1, col - 1);
        int num2 = calculatePascalValue(row - 1, col);
        return num1 + num2;
    }
}