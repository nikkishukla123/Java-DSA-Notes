package patternprint.composite;

import java.util.Scanner;

public class starbridge {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
       


        for(int i=1; i<=2*n-1; i++){  // line
            System.out.print("*");

        }
          System.out.println(); //next line most inmportant
         

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++)  //star
          System.out.print("*");
            
          for(int j=1; j<=2*i-1; j++)  //space
          System.out.print(" ");

          for(int j=1; j<=n-i; j++)  //star
          System.out.print("*");
          

          System.out.println(); 
        }
      sc.close();
    }
    } 


