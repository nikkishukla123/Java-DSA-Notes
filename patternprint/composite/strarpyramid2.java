package patternprint.composite;

import java.util.Scanner;

public class strarpyramid2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
        int nsp = n-1; // kyuki vo kaam hote jayega n sa
        int nst = 1; 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){  //space
                System.out.print(" ");
            }
            for(int j=1; j<=nst; j++){  // stars
                System.out.print("*");
            }
            System.out.println();
            nsp--; // nsp kam hoga nst badega
            nst+=2;
        }
        sc.close();
    }
}
