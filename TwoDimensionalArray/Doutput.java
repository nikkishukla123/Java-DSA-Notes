package TwoDimensionalArray;

import java.util.Scanner;

public class Doutput {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];  // row, column

        int m = arr.length;  // number of rows
        int n = arr[0].length;  // number of columns

        System.out.println("Enter elements for the 2D array:");

        // Input for 2D array
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output of 2D array
        System.out.println("2D Array Output:");
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");  // Use print instead of println
            }
            System.out.println();  // Move to a new line after each row
        }

        sc.close(); // Close the scanner
    }
}
