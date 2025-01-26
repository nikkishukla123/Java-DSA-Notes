package patternprint.specialpattern;
import java.util.Scanner;
public class fliptriang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            {
                for(int j=1; j<=n; j++){
                    if(i+j==n+1){
                    System.out.print("*"); //yha ln nahi likhna hai
                
                }
                    else{
                    System.out.print(" ");
                }
                System.out.println();  //yha sa ln nahi atana hai
            }
          }
          sc.close();
        
    }
} }
