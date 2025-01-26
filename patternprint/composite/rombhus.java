package patternprint.composite;

import java.util.Scanner;

public class rombhus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
       for(int i =1; i<=n; i++) {  
        for(int j =1; j<=n-i; j++){  
            System.out.print(" ");  // flip trangle print karega
        }
        for(int j =1; j<=n; j++){  
            System.out.print("*");  // can also print j ,i,or satar
        }
        for(int j =1; j<=i; j++){  
            System.out.print(" ");  // normal trangle print karega
        }
        System.out.println(); 
       }
       sc.close();
    }
}
