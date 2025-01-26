package loops;  // 4,7,10,13,16   // second method without using formula
  import java.util.Scanner;
public class arithmetic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter nth term ");
        int n = sc.nextInt();

        //
        // // 4,7,10,13,16 
      int a = 4 ,d = 3;
      for(int i=1; i<=n; i++){  // n time iteration hoga or n print hoga
        System.out.println(a);
        a+=d;          // a mein d ko add karte ja raha hai
      }

      sc.close();
    }
  
}
