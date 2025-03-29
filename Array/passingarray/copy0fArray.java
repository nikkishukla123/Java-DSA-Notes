package Array.passingarray; 

import java.util.Arrays;

public class copy0fArray {
    public static void main(String[] args) {
        int[]arr = {10,20,30,50};
       for(int ele : arr){
        System.out.println(ele);
       }
    System.out.println();

    // int []num = arr;
    // num[0]=90;
    
    // for(int ele: arr){   // Shallow copy ,it is not copy because changing is happening here
    //     System.out.println(ele);
    // }
 
    //Deep copy
    int[]brr = Arrays.copyOf(arr, arr.length);  //array method for coping
    brr[0]= 11;   // not updation of this number,this is actual copy
      for(int ele: arr){
        System.out.println(ele);
      }

      // loop method for copying
    int[]crr = new int[arr.length];
    for(int i =0; i<arr.length; i++){
        crr[i]= arr[i];
        System.out.println(crr);
    }
  
    }

    
}
// coping method in array one is creating new array other one usin method and third one is in loop assigning value to other array