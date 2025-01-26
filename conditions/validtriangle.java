package conditions;                            // if the given side is triangle or not
import java.util.Scanner;
public class validtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side");
        int a = sc.nextInt();
        System.out.println("enter second side");
        int b = sc.nextInt();
        System.out.println("enter third side");
        int c = sc.nextInt();
                                                                      // bracket dena safe hota hai agar heracchy na pata ho operator ka
        if(a<(b+c) && b<(a+c) && c<(b+a)){                                  // some of any two side is greater than one side
            System.out.println("these is the side of the triangle");
        } else
        System.out.println("not triangle");

        sc.close();
    }
    
    
}
