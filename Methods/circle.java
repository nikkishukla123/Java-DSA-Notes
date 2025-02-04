package Methods;  // taking radius of circle as an argument and return its area
import java.util.Scanner;
public class circle {
    public static double area(double r){
         // Method to calculate the area of a circle
        return Math.PI* r *r;   // Area = π * r
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       System.out.println("enter radius");
        double r = sc.nextDouble(); // Use nextDouble to handle decimal values

     double c= area(r);  // Call the area method and store the result

      System.out.println(c);

      sc.close();
    }
}


// flosting point ke time double use hoga