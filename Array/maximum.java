package Array;

public class maximum {
//     public static void main(String[] args) {
//         int[]arr = {10,8,9,20,50};
//         int max = arr[0];

//         for(int i=0; i<arr.length; i++){
//             if(arr[i]>max)
//            {
//             max = arr[i];
//              }
          
//         }
//         System.out.println(max);  // ye loop ke bahar hona chahye
//     }

//SECOND METHOD
public static void main(String[] args) {
  
       

            int[]arr = {10,8,9,20,50,-9,-1,-10};
            int max = Integer.MIN_VALUE;  // USING MATHEMATICAL
    
            for(int i=0; i<arr.length; i++){

                max = Math.max(max,arr[i]);
                }
              
            
            System.out.println(max);  // ye loop ke bahar hona chahye
        }












}


