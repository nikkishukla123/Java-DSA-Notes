package patternprint.composite;

import java.util.Scanner;

public class starpyramid {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){  //odd number ke time star print ho raha hai
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
