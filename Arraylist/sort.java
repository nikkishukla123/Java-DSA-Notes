package Arraylist;  //sort the number of zeroes and ones

public class sort {
    public static void main(String[] args) {
        int []arr = {1,0,1,1,1,0,0};
        int n = arr.length;
        // int numOfones = 0;  // not used this
        int numOfZeroes = 0;
        for(int i=0; i<n; i++){  // always i is less than n when starting from zero
            if(arr[i]==0){   //calculating no of zero
            numOfZeroes++; 
        }
    }
    System.out.println("size "+ numOfZeroes);
    for (int i = 0; i < numOfZeroes; i++) {   // Rebuilding the array to have all 0's followed by all 1's
        arr[i] = 0; // Fill first numOfZeroes elements with 0
    }
                                                  
     
    for (int i = numOfZeroes; i < n; i++) {
    arr[i] = 1; // Fill the rest with 1
}

        
        for (int i : arr) {
            System.out.print(i + " ");
        }

}
}
// first we calculate the number of zeros
// and then acc to size assign zeros and the remainging element with one