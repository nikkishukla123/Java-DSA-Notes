package loops;     // print  even number from 1 to 100

public class even {
    public static void main(String[] args) {
        

        for(int i=1; i<=100; i++){         // 100 iteration means changes it value and printin only 100 numbers
            if(i%2==0) System.out.print(i+ " ");
        }

        for(int i=2; i<=100; i+=2){    // 50 iteration
           System.out.println(i);
        }
    }
}
