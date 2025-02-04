package Array;

public class product {
    public static void main(String[] args) {
        int [] arr = {5,6};

        int mul=1; // initializing with 1 wont change any value

        for(int i=0; i<arr.length; i++){  // sum mein value dalte jana hai
            mul *= arr[i]; 
           
         }
         System.out.println(mul);
         
    }
}
