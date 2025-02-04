package Methods; // print square of first n natural number take n as argument
import java.util.Scanner;
public class squareofn {

   public static void square(int n){
   for(int i=1; i<=n; i++){
         System.out.println(i*i+" ");// squaring i
        
   }
  System.out.println(); // net line
   }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        square(n);  // calling 

        sc.close();
    }
}


//The method’s purpose is just to perform an action (printing), so there’s no need for return
//Here’s a quick recap:

// return is used to send a value back from a method, especially when you want to get a result of some calculation or operation (e.g., return sum;).
// void is used when a method doesn't need to return any value but just performs an action (e.g., printing, modifying data, etc.).