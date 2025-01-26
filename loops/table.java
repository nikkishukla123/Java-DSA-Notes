package loops;          // different loops for printing 19 table

public class table {
    public static void main(String[] args) {
       
     //171 rounds
        for(int i=19; i<=190; i++ ){     //bekar code  ek ek step sa code increase horaha hai
            if(i%19==0) System.out.println(i);
        }
     // only 10 round
        for(int i=19; i<=190; i+=19 ){    // ismen code 19 sa increase hote ja raha hai add karke
            if(i%19==0) System.out.println(i);
        }

    }
}
