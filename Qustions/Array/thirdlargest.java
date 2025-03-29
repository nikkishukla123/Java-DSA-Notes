package Qustions.Array;

import java.util.Arrays;

public class thirdlargest {
    public static void main(String[] args) {
         int[] arr = {10, 4, 3, 50, 23, 90, 11};
         int n= arr.length;
        // Step 1: Sort the array in descending order
        Arrays.sort(arr);
        for(int i=n-1; i>=n-3; i--){ //going from last to third last after sorting
            System.out.println(arr[i]);
        }
    }
}
