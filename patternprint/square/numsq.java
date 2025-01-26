package patternprint.square;
import java.util.Scanner;
public class numsq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){  
                System.out.print(j);  // j hi badal raha hai or i bhi likh sakte hai yha
            }
            System.out.println();
        }
        sc.close();
    }
    
}
