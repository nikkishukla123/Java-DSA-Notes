package patternprint.specialpattern;

import java.util.Scanner;

public class starcross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
      
       for(int i =1; i<=n; i++) {  //rows
        for(int j =1; j<=n; j++){ 
           if(i==j || i+j==n+1 )   // jab i or j equal ya i or j ka add n+1 hai
            System.out.print("*" +" ");
            else 
            System.out.print("  "); // two space have to print
        }
        System.out.println();
       }
       sc.close();
    }
}
