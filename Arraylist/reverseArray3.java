package Arraylist;
// it is a diiferent function we creted which perform swapping
public class reverseArray3 {     
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        int n = arr.length; //not a method
        int i=0; int j=n-1;  // j from back
    
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
       for(int ele: arr){
        System.out.println(ele+" ");
       }
        System.out.println();

   } 

   public static void swap (int[]arr, int i,int j){  // it is a diiferent function we creted which perform swapping
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j] = temp;
 

}









} 
