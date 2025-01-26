package loops;   // to find the sum of given digit
import java.util.Scanner;
public class sumdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter digit: ");
        int n = sc.nextInt();
        int sum = 0;                               

        while (n != 0) { // Loop runs until the number becomes 0
            int d = n % 10;   // Find the last digit of the number   %= aise karke koi operator nahi hota hai
            sum += d;          // Add the last digit to sum
            n /= 10;           // Remove the last digit from the number
        }
           System.out.println(sum);

           sc.close();
    }
   
}  
