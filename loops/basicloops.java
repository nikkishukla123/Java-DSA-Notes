package loops;
import java.util.Scanner;

public class basicloops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){     // for printing helloworld n times
            System.out.println("hello world");
        }


        sc.close();
    }
}
