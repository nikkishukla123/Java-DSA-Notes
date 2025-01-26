package loops;

public class Continue {
  public static void main(String[] args) {
    // for(int i=1; i<=100; i++){      //100 iteration
    //     if(i%2!=0)
    //     System.out.println(i);
    // }

    // for(int i=1; i<=100; i+=2){      //50 iteration
    //     System.out.println(i);
    // }
    
    for(int i=1; i<=100; i++){      //100 iteration
        if(i%2==0) {
            continue;              // iska matlab hota  hai skip karna
        }
        System.out.println(i);
    }

    








  }
    
}
