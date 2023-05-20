public class PascalTriangleIteration {
    public static void main(String[] args) {
        int rows = 5; // Number of rows to print!!

        printtriangle(rows);
    }
            //                 1
            //             1       1
            //         1       2       1       
            //     1       3       3       1
            // 1       4       6       4       1
    public static void printtriangle(int rows) {
        // Iterate over each row!!
        for (int i = 0; i < rows; i++) {
            int num = 1; // Initialize the first value of the row!!

            for (int j = 0; j < rows - i; j++) {// this will print the spaces
                System.out.print(" ");
            }

            // Printing the values of the row
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " "); //spaces after each number

                // Calculating the next value based on the current value
                num = num * (i - j) / (j + 1);  //(i=1)num = 1 * (1 - 0) / (0 + 1)                                                               
            }

            System.out.println(); // Move to the next line for the next row
        }
    }
}
