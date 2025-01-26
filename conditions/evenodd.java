package conditions;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number:");
    int n = sc.nextInt();
    if(n%2==0) System.out.println("even"); // dono line check hoti hai ismein else mein koi ek
    if(n%2==1) System.out.println("odd");
  
    sc.close();
} 
}
