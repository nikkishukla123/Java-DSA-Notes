package Qustions.Array;

public class duplicate {
    public static void main(String[] args) {
        int[] arr ={1,2,4,5,1};
        boolean result =containsDuplicate(arr);
         System.out.println(result);
}

public static boolean containsDuplicate(int[] arr){
    for(int i=0; i<arr.length; i++){
       for(int j=i+1; j<arr.length; j++){
         if(arr[i]==arr[j])
           return true;
       }
    }
      return false;
    
}
}


// if the array has 5 elements the loop will go up to i = 4, and arr[4+1] = arr[5] will result in an ArrayIndexOutOfBoundsException.