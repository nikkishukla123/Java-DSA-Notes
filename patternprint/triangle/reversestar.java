package patternprint.triangle;
import java.util.Scanner;
public class reversestar {
    
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            // for(int i=n; i>=1; i--){  
            //     {
            //         for(int j=1; j<=i; j++){
            //             System.out.print("*"); //yha ln nahi likhna hai
            //         }
            //         System.out.println();  //yha sa ln nahi atana hai
            //     }
            //   }
            //   sc.close();
                                   //can also sonve using formula i+jmax

            for(int i=1; i<=n; i++){
                {
                    for(int j=1; j<=n+1-i; j++){
                        System.out.print("*"); //yha ln nahi likhna hai
                    }
                    System.out.println();  //yha sa ln nahi atana hai
                }
              }
              sc.close();
            }

        }
    

