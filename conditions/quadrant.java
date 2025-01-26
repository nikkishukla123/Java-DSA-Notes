package conditions;      // given point x & y find out it lies in which quadrant
import java.util.Scanner;
public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a x");
        int x = sc.nextInt();
        System.out.println("enter a y");
        int y = sc.nextInt();


        if(x==0 && y==0) {
            System.out.println("lies at origin");
        }
        else if(y==0){
            System.out.println("lies at x axis");
        }
        else if(x==0){
            System.out.println("lies at y axis");
        } else if(x>0 && y>0){
            System.out.println("lies at first quadrant");
        } else if(x<0 && y>0){
            System.out.println("lies at second quadrant");
        } else if(x<0 && y<0){
            System.out.println("lies at third quadrant");
        } else {
            System.out.println("lies in fourth quadrant");
        }
        sc.close();
    }
}
