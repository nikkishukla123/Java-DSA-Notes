package patternprint.specialpattern;

import java.util.Scanner;

public class starplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
        int mid = n/2+1;
       for(int i =1; i<=n; i++) {  //rows
        for(int j =1; j<=n; j++){ 
           if(i==mid|| j==mid)
            System.out.print("*" +" ");
            else 
            System.out.print("  "); // two space have to print
        }
        System.out.println();
       }
       sc.close();
    }
}
