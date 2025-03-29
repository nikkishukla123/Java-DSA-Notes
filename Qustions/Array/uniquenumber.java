package Qustions.Array;

public class uniquenumber {
    public static void main(String[] args) {
      int[]  arr = {4, 3, 2, 4, 2, 3, 1};
      int unique = 0;
      for(int i=0; i<arr.length; i++){
        unique^=arr[i];
        
    }
   System.out.println(unique);
}
}
//finding unique number
// Why XOR?: All numbers that appear twice will cancel out because of the property a ^ a = 0. Only the number that appears once will remain.