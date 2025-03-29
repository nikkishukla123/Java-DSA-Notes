package Qustions.Array;

public class minimum {
    public static void main(String[] args) {
        int [] arr = {20,30,40,10,2,1,0};
        int x = arr[0];
        for(int i=0; i<arr.length;i++){
              if(arr[i]<=arr[0])
              x=arr[i];
        }
        System.out.println(x);
    }
}

// initialize x with first element then updating it if other elements are less than this