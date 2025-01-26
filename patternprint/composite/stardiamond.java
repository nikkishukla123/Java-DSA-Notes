package patternprint.composite;
import java.util.Scanner;
public class stardiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
     int nst=1;
     int nsp=n-1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
         System.out.print(" ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("*");
            }

          nsp--;
          nst+=2;
            System.out.println();
        }

        //ulta triangle
      nsp=1;    // reinitialize nahi karna bas
      nst=nst-4;

        for(int i=1; i<=n-1; i++){  //i ki value 4 enter karenga tho bhi 3 tak jayegi
            for(int j=1; j<=nsp; j++){
         System.out.print(" ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("*");
            }

          nsp++;
          nst-=2;
            System.out.println();
        }
        sc.close();
    }
}
