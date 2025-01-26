package conditions;                           // finding least of three number without using &&,                                          
import java.util.Scanner;                     //agess of ram sham and ajay are input through the keyboard  to determine youngest of them
public class leastnested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ram age");
        int a = sc.nextInt();
        System.out.println("enter shyam age");
        int b = sc.nextInt();
        System.out.println("enter ajay age");
        int c = sc.nextInt();


        if(a<=b){
            if(a<=c) System.out.println(a+" ram is youngest");
            else System.out.println(c +" ajay is youngest");    //c>= a>b
        }
        else 
            // agar b chhota hai
        {
            if(b<=c) System.out.println(b+"shyam is youngest");
            else System.out.println(c + " ajay is youngest");
        }

        sc.close();
    }
}
