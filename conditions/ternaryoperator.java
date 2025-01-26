package conditions;        // expression 1 ? exression 2 : expresssion 3

import java.util.Scanner;       //print if number is even or odd

public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
      int n = sc.nextInt();
                        // (condition) ? 'true':'false'
      System.out.println((n%2 == 0) ? "even": "odd");
      sc.close();
    }
}
