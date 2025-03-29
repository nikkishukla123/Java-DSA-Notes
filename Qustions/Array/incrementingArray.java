package Qustions.Array;

public class incrementingArray {
    public static void main(String[] args) {
       int[] arr = {5, 8, 2, 10, 4, 7};
       for(int i=0; i<arr.length; i++){
               if(i%2==0){
                 // Even index: Increment by 10
                arr[i]+=10;
               } else{
                // Odd index: Change to its second multiple
                arr[i]*=2;
               }
       }
       for(int i=0; i<arr.length; i++){  
        System.out.println(arr[i]); 
    }
}
}
//Given an array of integers, change the value of all odd indexed elements to its second multiple and
//  increment all even indexed values by 10