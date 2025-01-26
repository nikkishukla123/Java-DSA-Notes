package loops;  // write a program to count the digit
import java.util.Scanner;
public class countdigit {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit: ");
        int n = sc.nextInt();
        int count = 0;
    
     while(n!=0){          // aise cases mein while use karenga jab condition aise pata ho,jab n hi condition ho
        n/=10;
        count++;
     }
            System.out.println(count);

            sc.close();
    }
}
