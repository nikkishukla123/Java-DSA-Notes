package patternprint.triangle;
import java.util.Scanner;
public class oddtrang {  // first method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int odd = 1;  // / Initialize to the first odd number
        // for(int i=1; i<=n; i++){
        //   {
        //       for(int j=1; j<=i; j++){
        //        System.out.print(odd+" ");  // Print the current odd number
        //        odd+=2;  // move to th next odd number
        //       }
        //       System.out.println();  //yha sa ln nahi atana hai
        //   }
        // }
        sc.close();
// second method
        for(int i=1; i<=n; i++){
            {
                for(int j=1; j<=i; j++){
                 System.out.print(2*j-1);  // Print the current odd number
                 
                }
                System.out.println();  //yha sa ln nahi atana hai
            }
          }
          sc.close();
    }
}
