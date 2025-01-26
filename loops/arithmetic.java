package loops;  // display the Ap 1,3,5,7,9 till nth term

import java.util.Scanner;

// method 1 maths formula
// a,a+d,a+2d....a+(n-1)d    so here a=1 && diff=2
// nth term = 2n-1
public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
     // 1 3 5 7 9..
        for(int i=1; i<=(2*n-1); i+=2){      // n rounds jitna n utna iteration
                System.out.println(i);      //  
        }
        sc.close();
    }
    
}
