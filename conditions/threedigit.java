package conditions;    // to find if number is three digit or not

import java.util.Scanner;

public class threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        if(n>99 && n<1000){
            System.out.println(" number is three digit");
        } else
        System.out.println("not three digit");

        sc.close();
    }
}
