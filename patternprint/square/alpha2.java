package patternprint.square;

import java.util.Scanner;
// aaaaa
// bbbbb
// ccccc
// ddddd
// eeeee
public class alpha2 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){  
                System.out.print((char)(i+96)); // a ka ascii value 97 hai isliye j + kar rahe hai
            }                                     // phir usko char mein badal teh hai
            System.out.println();
        }
        sc.close();
    }
}
