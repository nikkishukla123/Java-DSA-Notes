package Arraylist;// sort the array of 0,1s and 2s

public class Dutchflagalgo {
    public static void main(String[] args) {
        int[]arr = {0,2,2,2,0,0,1,1,0};
        int n = arr.length;
        int mid = 0; int low =0;
        int high=n-1;
        for(int i =0; i<n; i++){
       
            System.out.print(arr[i]+" ");
         }

  System.out.println();

        while(mid<=high){
            if(arr[mid]==0){
               int temp = arr[mid];   // swapping
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if(arr[mid]==2){    
                int temp = arr[high];  // swapping
                arr[high] = arr[mid];
                arr[mid] = temp;
               
                high--;
            } else {
                mid++;
            }
        }
        for(int i =0; i<n; i++){
       
            System.out.print(arr[i]+" ");
         }
    }
}
// array chalega jab tak mid high sa chota hai swap hoga mid low ki value , aagar mid value mein high value ayaa tho mid or high ki value swap hogi
//agr mid mid hi raha tho bas m++ hoga