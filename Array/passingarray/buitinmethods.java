package Array.passingarray;  // some methods of array 

import java.util.Arrays;

public class buitinmethods {
    public static void main(String[] args) {
        int arr[] ={20,10,50,15 };
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);  //sorting array in acending order
        System.out.println();

        for(int i=0; i<arr.length; i++){  //then again printing
            System.out.println(arr[i]);
        }
//other method of for loop in array
     
   for(int ele: arr){
    System.out.println(ele);
   }
   

    }
}
