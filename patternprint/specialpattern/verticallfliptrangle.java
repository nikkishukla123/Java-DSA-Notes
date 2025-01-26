package patternprint.specialpattern;

import java.util.Scanner;

public class verticallfliptrangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
       for(int i =1; i<=n; i++) {  //rows
        for(int j =1; j<=n; j++){  //columns
            if(i+j>n)             // i+j if greater hai then
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println(); // Move to the next line after each row
       }
       sc.close();
    }
}
