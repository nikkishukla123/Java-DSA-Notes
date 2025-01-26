package patternprint.triangle;
import java.util.Scanner;
public class startriangle {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=1; i<=n; i++){
        {
            for(int j=1; j<=i; j++){
                System.out.print("*"); //yha ln nahi likhna hai
            }
            System.out.println();  //yha sa ln nahi atana hai
        }
      }
      sc.close();
    }
}
