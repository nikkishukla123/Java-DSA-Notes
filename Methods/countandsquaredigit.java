package Methods;

import java.util.Scanner;

public class countandsquaredigit {

    public static void count(int n){
        int count = 0;
        if(n == 0){  //agar n zero hua tho count 1 ho jayega 
            count=1;
            
        } else  {
        while (n!=0){  // Count digits by dividing the number by 10 until it becomes 0
            n=n/10;   // Remove the last digit
            count++;
        }
        System.out.println(count);
       int square = count * count;   // print the square of digit
       System.out.println(square);
    } }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       count(n);

       sc.close();
    }
}
   

// count and square 
// Example:
// Let's say the number is 4567:

// The number 4567 has 4 digits.
// The square of 4 (the number of digits) is 16.