package Qustions.Array;
import java.util.Scanner;
public class smallestpositivenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Read each element , only input part
        }
        
          int expected = 1;
        for(int i=0; i<n; i++){
              if(arr[i]==expected){
               expected++;
              }
        }
        System.out.println("Smallest missing positive number: " + expected);
    sc.close();
    }
}
// WAP to find the smallest missing positive element in the sorted Array. (take the array as input)
// element start hoga 1 sa or agar arr value matches the element then ++ ,
//if not loop disable and current element is printed which not matches in arr