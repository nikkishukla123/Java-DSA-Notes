package patternprint.triangle;

import java.util.Scanner;

public class repeatnum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){  //ya baar lopp mein chalega i same rahega vo cahnge nahi hoga ussa hi phir print kar dega
                System.out.print(i);  
            }
            System.out.println();
        }
        sc.close();
    }
}
