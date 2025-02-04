package Array;  // calculate the sum of all elements in the given arrray 81,71...

public class sum {
    public static void main(String[] args) {
        int arr[] = {10,81,75,89,99,100};

         int sum = 0;   // first initialize sum

         for(int i=0; i<arr.length; i++){  // sum mein value dalte jana hai
            sum += arr[i]; 
           
         }
         System.out.println(sum);
    }
}
