package conditions;                                   // to find profit or loss
import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a cost price");
        int cp = sc.nextInt();
        System.out.println("enter a selling price");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.println("profit "+(sp-cp));
        }
        else if(cp>sp){
            System.out.println("loss "+(cp-sp));
        }
        else
        System.out.println("no profit noloss");

     sc.close();   
    }
}
