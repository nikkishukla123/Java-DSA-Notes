package Arraylist;  // find the greatest  array by comparing

public class greatest {
    public static void main(String[] args) {
        int[]arr = {22,24,25,49,30,15,16};
        int n = arr.length;                   
        
        int[]ans = new int[n];
        ans[n-1] = -1;

    //     for(int i =0; i<n-1; i++){
    //         int mx = Integer.MIN_VALUE;
    //         for(int j=i+1; j<n; j++){
    //             mx = Math.max(mx,arr[j]);
    //         }
    //         ans[i] = mx;
    //     }
    //    // only printing
    //     for(int ele: arr){   //befor array
    //         System.out.print(ele+" ");
    //     }
    //     System.out.println();

    //     for(int ele: ans){   // after array
    //         System.out.print(ele+" ");
    //     }
     
// For i = 0 (arr[0] = 22), the program looks at the elements to the right: {24, 25, 49, 30, 15, 16}. The maximum is 49. So, ans[0] = 49.
// For i = 1 (arr[1] = 24), the program looks at the elements to the right: {25, 49, 30, 15, 16}. The maximum is 49. So, ans[1] = 49.
// For i = 2 (arr[2] = 25), the program looks at the elements to the right: {49, 30, 15, 16}. The maximum is 49. So, ans[2] = 49.
// For i = 3 (arr[3] = 49), the program looks at the elements to the right: {30, 15, 16}. The maximum is 30. So, ans[3] = 30.
// For i = 4 (arr[4] = 30), the program looks at the elements to the right: {15, 16}. The maximum is 16. So, ans[4] = 16.
// For i = 5 (arr[5] = 15), the program looks at the elements to the right: {16}. The maximum is 16. So, ans[5] = 16.
  
//optimised method
  
    int nge = arr[n-1];  // storing last value as -1
    for(int i=n-2; i>=0; i--){  //starting with second last
        ans[i] = nge;
        nge = Math.max(nge,arr[i]);
    }
//    only printing
        for(int ele: arr){   //befor array
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int ele: ans){   // after array
            System.out.print(ele+" ");
        }

// in this method we are going in reverse direction and storing the next greatest element and then upadating it with current max element
// jaise pehla sirf dekhenga 16  -1  mein sa kon bda hai vo likhenga phir 15,16 mein sa kon hai


// first vale mein i ki vale o s a last tak and j ki value zero sa sceond last tak and getting max valuue








}
}