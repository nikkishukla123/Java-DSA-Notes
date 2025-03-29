package Arraylist;  // rotate the given array 3 times or n number of times k = 3 , n =7
                

    public class Rotat {

        // Method to reverse a portion of the array
        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    
        // Method to rotate the array by k positions
        public static void rotating(int[] arr, int k) {
            int n = arr.length;
            k = k % n; // Ensure k is within bounds (if k is greater than n) ,k ki value pta kar lena uske remainder sa
    
            // Reverse the first part (from 0 to n-k-1)
            reverse(arr, 0, n - k - 1);
    
            // Reverse the second part (from n-k to n-1)
            reverse(arr, n - k, n - 1);
    
            // Reverse the entire array (from 0 to n-1)
            reverse(arr, 0, n - 1);
        }
    
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50, 60, 70,80};
            int k = 5;
    
            // Print original array
            System.out.println("Original Array:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
    
            // Rotate the array by k positions
            rotating(arr, k);
    
            // Print array after rotation
            System.out.println("\nArray after rotation:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
    
// it is rotating for all value, of k for any number there is two function one is for rote one is for reverse, rotate is calling reverse 3 times
// and then main is calling rotate once only