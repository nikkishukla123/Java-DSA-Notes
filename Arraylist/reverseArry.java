package Arraylist; //write aprogrm to reverse the array without using extra array

public class reverseArry {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,60,70,80};
       int n = arr.length;
        for(int i=0; i<n/2; i++){  //yha pa array ko half kiya hai kyuki half part have to reverse if we reverse the full part it cannot be changed
           int j=n-1-i; // i+j=n-1;   // j starting from last
           int temp = arr[i];
           arr[i]= arr[j];
           arr[j] = temp;
            
        }
        for(int ele: arr){
            System.out.println(ele+" ");
        }
        System.out.println();
    }
}



