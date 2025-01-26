package patternprint.square;
// rectangle printing
import java.util.Scanner;
public class rec {
    // public static void main(String[] args) {
    //     for(int i=1;i<=4;i++){ // row ke liye
    //         for(int j=1;j<=15;j++){  // columns
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }

    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){ // row ke liye
            for(int j=1;j<=m;j++){  // columns
                System.out.print("* ");
            }
            System.out.println();
        }
              sc.close();
    }
}
