package Qustions.Array;

public class checksortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 51};
         int n= arr.length;
     if(checksorted(arr)){
        System.out.println("sorted array");
     }  else {
        System.out.println("no sorted");
     }
         
         }
        
    

   public static boolean checksorted(int[]arr){
              boolean ascending = true;
              boolean descending = true;
     for(int i=0; i<arr.length-1; i++){
        if(arr[i]>arr[i+1]){// If an element is greater than the next, it's not ascending
             ascending = false;
        }
        if(arr[i]<arr[i+1]){  //If an element is smaller than the next, it's not descending
            descending = false;
       }
     }// If the array is either ascending or descending, return true
     return ascending || descending;
   }



}
// firstly we set the boolean value true and then check ascen descend codition and return true
// if any one of them is true