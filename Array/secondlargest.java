package Array;

public class secondlargest {
    public static void main(String[] args) {
                int[]arr = {10,8,9,20,50,30};
                int max = arr[0];
        
                for(int i=0; i<arr.length; i++){
                    if(arr[i]>max)
                   {
                    max = arr[i];
                    
                     }
                  
                }
               
                // max ko chodkar print karo
                int smax = arr[0];

                for(int i=0; i<arr.length; i++){
                    if(arr[i]!=max)  // means it is not max
                   {
                    smax = arr[i];
                    
                     }
                  
                }
         System.out.println(max);
         System.out.println(smax);


            }
}
