package conditions;                                  // to compare area and perimeter of rectangle
import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length");
        int x = sc.nextInt();
        System.out.println("enter a breadth");
        int y = sc.nextInt();
        int a = x*y;
        int p = 2 * (x + y);
        if(a>p){
            System.out.println("area is greater "+a);
        }
       else
            System.out.println("perimeter is greter "+p);

     sc.close();   
    }
}