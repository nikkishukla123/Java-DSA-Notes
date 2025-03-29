package TwoDimensionalArray;

public class Max {
    public static void main(String[] args) {
    int[][] arr = {{1,2,3},{4,5,6},{6,30}};
    int mx = Integer.MIN_VALUE;
    int m = arr.length;
    int n = arr[0].length;  // Assuming all rows have the same length give out of bound if not of same length
       int sum = 0;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            mx = Math.max(mx, arr[i][j]);
            sum+=arr[i][j];  // also calculating sum
        }

    }
    System.out.println(mx);
    System.out.println(sum);
} }
// calculating max and sum 