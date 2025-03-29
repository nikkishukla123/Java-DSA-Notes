package Arraylist;

public class reverseArray2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,60,70,80};
       int n = arr.length;
         int i = 0; int j = n-1;  // yha per j ki value aaise rahegi kyuki j neeche decremnet horaha hai , initiate with last ele
         
       while(i<=j){  //it is cause jaise hi less than hoga tho tho dono phir ilta hone lagenga
        int temp = arr[i];
           arr[i]= arr[j];
           arr[j] = temp;
           i++;
           j--;
                  
       }
       for(int ele: arr){
        System.out.println(ele+" ");
       }

       System.out.println();
    }
}
