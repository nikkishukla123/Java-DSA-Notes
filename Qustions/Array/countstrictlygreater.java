package Qustions.Array;

public class countstrictlygreater {
    public static void main(String[] args) {
        int[]arr = {1, 4, 7, 2, 9, 3};
        int x = 5;
        int count = 0;

        for (int i=0; i<arr.length; i++){
             if(arr[i]>x){
                count+=1;
                
             }
             
        }
        System.out.println("count of grater element is "+ count);
    }
}
// Count the number of elements strictly greater than x.
// Increment the count if the element is strictly greater than x