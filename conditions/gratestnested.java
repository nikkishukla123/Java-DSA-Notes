package conditions;                           // finding greatest of three number without using &&
import java.util.Scanner;
public class gratestnested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side");
        int a = sc.nextInt();
        System.out.println("enter second side");
        int b = sc.nextInt();
        System.out.println("enter third side");
        int c = sc.nextInt();


        if(a>=b){
            if(a>=c) System.out.println(a+"a is greater");
            else System.out.println(c +" c is greatest");    //c>= a>b
        }
        else 
        // b>=a
        {
            if(b>c) System.out.println(b+"b is greater");
            else System.out.println(c +" c is greatest");
        }

        sc.close();
    }
}
