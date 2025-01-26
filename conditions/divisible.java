package conditions;                                   // divisible by 5 or 3 given number
import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a positive integaer");
        int n = sc.nextInt();

        if(n%5==0 || n%3==0){
            System.out.println("number is divisible by 5 or 3");
        } else
        {
            System.out.println("not divisible");
        }
        sc.close();
    }
}
