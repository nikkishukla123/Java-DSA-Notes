package Qustions.Array;//two pointer approach

public class checkPalindromeArray {
    public static void main(String[] args) {
       int[]arr = {1, 2, 3, 4, 5};
       if(ispalindrome(arr)){
        System.out.println("The array is a palindrome.");
     }  else {
        System.out.println("The array is not a palindrome.");
     }
      
    }


    public static boolean ispalindrome(int[]arr){
        int n = arr.length;
        int i =0 ; int j = n-1;
             
        while(i<=j){
         if(arr[i]!=arr[j]){
         return false;
         }
         i++;
         j--;
        }
         return true;
    }
}
// A palindrome is a sequence of characters or numbers that reads the same backward as forward.
//i ko start sa or j ko end sa have to compare if j become grater from i then have to stop
// i++ or j ko j-- karte jana hai,ek bhi i orj kivalue agar equal nahi hui tho stop return false