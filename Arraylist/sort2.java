package Arraylist;  // sort the array of 0,1s and 2s

public class sort2 {
    public static void main(String[] args) {
        int[]arr = {0,2,2,2,0,0,1,1,0};
        int n = arr.length;
        int zero=0;
        int ones=0;
        // int twos=0;  iski jarurat nahi hoti

        for(int i=0; i<n; i++){
            if(arr[i]==0){   //calculating no of zero
                zero++; 
        }  if (arr[i]==1)
             ones++;
       
     }

     for(int i =0; i<n; i++){
        if(i<zero) arr[i]=0;
        else if(i<zero+ones) arr[i]=1;  // 0+1
        else arr[i]=2;
     }
     for(int i =0; i<n; i++){
       
        System.out.println(arr[i]);
     }
    


}
}
// only calculating zeros and ones and then zero sa kaam hua tho 0 or if leass than 0+1 then 1 if nothing then 2