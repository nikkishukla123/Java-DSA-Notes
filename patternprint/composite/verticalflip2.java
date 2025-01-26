package patternprint.composite;

import java.util.Scanner;

public class verticalflip2 {  //second method
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
       for(int i =1; i<=n; i++) {  //rows
        for(int j =1; j<=n-i; j++){  //columns
            System.out.print(" ");
        }
        for(int j =1; j<=i; j++){  //columns
            System.out.print(j);  // can also print j ,i,or satar
        }
        System.out.println(); // Move to the next line after each row
       }
       sc.close();
    }
}
