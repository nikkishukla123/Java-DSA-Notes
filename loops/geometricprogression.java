package loops; // display this gp 1,2,4,8,16,32
import java.util.Scanner;
public class geometricprogression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter n term");
           int n=sc.nextInt();
        int a=1;
        for(int i =1; i<=n; i++){          // loop chalega nth time print karega a ko usko baar baar double karega    
           System.out.println(a);
           a*=2;                   // a ko mutiply kiya jaraha 2 sa kyuki given term double horaha hai
        }


        sc.close();
   
    }
  
}
