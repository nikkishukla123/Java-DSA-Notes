package patternprint.triangle;  //alternate triangle

import java.util.Scanner;

public class mixtriang {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){  // i ka even odd consider karenga j ka nahi
                if(i % 2 ==0)  // agar even hai tho ABC print karo
                System.out.print((char)(j+64));
                else{  // nahi tho 123
                    System.out.print(j);
                }
            }

            System.out.println();
        }
        sc.close();
    }
}
