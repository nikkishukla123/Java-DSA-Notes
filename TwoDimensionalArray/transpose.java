package TwoDimensionalArray;  // write a program to print transpose of matrix input by user and store it also

public class transpose {
    public static void main(String[] args) {
        // 1  2
        // 3  4
        // 5  6
               // column wise print
        int arr[][] = {{1,2},{3,4},{5,6}};
        int m = arr.length;
        int n = arr[0].length;
        for(int j =0; j<n; j++){   // first printing column by fixing column size and changing row eg(0,0)(1,0)
            for(int i=0; i<m; i++){
               System.out.print(arr[i][j]);
            }
            System.out.println();
        }

             // storing 
             int [][] transpose = new int[n][m]; // Creating a new 2x3 matrix
             for(int i =0; i<n; i++){ // Outer loop over new rows (original columns)
                 for(int j=0; j<m; j++){ // Inner loop over new columns (original rows)
                     transpose[i][j] = arr[j][i];  // Swapping elements
                     System.out.print(transpose[i][j]+" ");
                 }
                 System.out.println();
             }
    }
    
}
// niche vale ke liye alag hai i,j isliye dono alag hai
// niche vale mein j i ke liye jga bnayi hai islye swapping j, i hona chaiye instead of i,j