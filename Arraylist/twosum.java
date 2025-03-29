package Arraylist;//find the doublet in the array whose sum is equal to the given value x(two sum)

public class twosum {
    public static void main(String[] args) {
        int[] arr = {3,4,5,0,9};
        int x = 9;
      int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==x){  // sum of two are equal
                    System.out.println(arr[i]+" "+arr[j]);
                    //break
                }
                
            }

        }
    }
}
// in this we are checking sum leetcode mein alag tariksa kiya
//in this two value eyual to sum , first travelling with i and then travelling with j value ahead to i
