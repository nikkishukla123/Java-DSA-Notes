package loops;        // write a program to print composite number and prime number and use of= Break
import java.util.Scanner;
public class composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();

        int x = 0; // 0 means prime

        for(int i=2; i<=n-1; i++){
            if(n%i == 0){           // i is a factor of n
                System.out.println("composite number");     
                 x = 1;
                 break;     // here it is used so composite number cannot be printed multiple time 
            }

        }
        if(n==1) System.out.println("neither prime nor composite");
        else if(x==0) System.out.println("prime number");
        sc.close();
    }
}
