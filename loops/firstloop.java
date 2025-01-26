package loops;   // print numbers from 1 to 100

import java.util.Scanner;

public class firstloop {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         sc.close();
        // initilization; condition;increment
         for(int i = 1; i<=100; i++){
                 System.out.println(i+ " ");
         }
    }
}
