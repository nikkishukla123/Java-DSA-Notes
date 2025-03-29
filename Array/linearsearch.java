package Array;  // find the element x in the array,take array and x as input
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target element");
        int x = sc.nextInt();
          System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements");
        for(int i=0; i<n; i++){
            
            arr[i] = sc.nextInt();
            // if(arr[i]==x){   // ist method
            //     System.out.println("element found");
            // }
        }

// METHOD TWO BOOLEAN
boolean fetch = false;  // set to not found

for(int i=0; i<n; i++){
    if(arr[i]==x){
        fetch = true;  //means found
        // break;
        
    }

}
if(fetch==true){    //only printing is happening here
    System.out.println("element found");
} else System.out.println("not");


sc.close();
    }
}
