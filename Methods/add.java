package Methods;
import java.util.Scanner;
public class add {

    public static int calculatesum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

      int c =  calculatesum(a,b);  // calling the function
        System.out.println(c);

        sc.close();  // always put it in main function
    }
   
}

// creating two function one is main function and the other one is user define fuction
// we have to call the created function in main fuction
//You can call a method multiple times in different places in your program.