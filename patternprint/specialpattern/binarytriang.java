package patternprint.specialpattern;  
import java.util.Scanner;
public class binarytriang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){   // if sum of both are even then print
                    System.out.print("1 ");
                } else
                System.out.print("0 ");
            }
            System.out.println();
        }
        sc.close();
    }
}  // can also done with the help of nested if else
