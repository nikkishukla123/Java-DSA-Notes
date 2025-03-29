package Array;
import java.util.Scanner;
public class basicsyntax2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter array size");
        int n = sc.nextInt();  // n size array 
        int arr[] = new int[n];
        // int arr[] = new int[4]; // can also do n size array rather than fix size

         //easyway of initializing individual elements
         for(int i=0; i<n; i++){   //input
            arr[i] = sc.nextInt();
         }

         for(int i=0; i<=n-1; i++){   //input
          System.out.print(arr[i]);
         }
sc.close();
    }
}
