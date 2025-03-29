package Arraylist;

import java.util.ArrayList;

public class declaration {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);// initial arry size
        arr.add(0,20);  // initialization
        arr.add(1,10);
        arr.add(2,30);
        arr.add(3,50);
        arr.add(4,60);
        //   System.out.println(arr);   // all elements in array will print
          for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");  //arr[i]
          }
                   System.out.println();

        arr.set(2,100); // modify
       System.out.println(arr+" ");
       
       arr.add(12); //push the element in the array by increasing size automatically
         System.out.println(arr);
         System.out.println(arr.size()); 

         arr.remove(4);  //remove the element in the array by increasing size automatically
         System.out.println(arr);
    }
}
// here we can initialize , modify elements in array list and push and also remove