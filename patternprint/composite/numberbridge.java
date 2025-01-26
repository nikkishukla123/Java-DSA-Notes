package patternprint.composite;

import java.util.Scanner;

public class numberbridge {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
       


        for(int i=1; i<=2*n-1; i++){  // line
            System.out.print(i);

        }
          System.out.println(); //next line most inmportant
         
    int a=1;
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=n-i+1; j++)  //star
         {
            System.out.print(a);
            a++;
         }
            
          for(int j=1; j<=2*i-1; j++)  {
            System.out.print(" ");  // ismein a ko print nahi karenga
            a++;
          }
         

          for(int j=1; j<=n-i; j++)  {
            System.out.print(a);
            a++;
          }
          
          

          System.out.println(); 
        }
      sc.close();
    }
}
