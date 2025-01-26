package conditions;                    // print the greatest of all three number
import java.util.Scanner;
public class greatestnum {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first side");
    int a = sc.nextInt();
    System.out.println("enter second side");
    int b = sc.nextInt();
    System.out.println("enter third side");
    int c = sc.nextInt();

  if(a>=b && a>=c ) System.out.println(" a is greater");
  else if(b>=a && b>=c) System.out.println("b is greater");
  else System.out.println(" c is greater");

sc.close();

}  
}