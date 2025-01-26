package patternprint.square;

import java.util.Scanner;

public class squ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
       for(int i =1; i<=n; i++) {  //rows
        for(int j =1; j<=n; j++){  //columns
            System.out.print("* ");
        }
        System.out.println();
       }
       sc.close();
    }
}
