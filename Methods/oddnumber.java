package Methods;  //given two numbers a and b write a method to print all odd numbers between them
import java.util.Scanner;
public class oddnumber {
    public static void oddnumbers(int a, int b){
        for(int i = a; i<=b; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        oddnumbers(a, b);

        sc.close();
    }
}
 // only have to print so no return is used here, printing is happenin in the function itself so no need to do in main function only calling is done