package Array.passingarray;

public class passingarraytomethods {
    // public static void main(String[] args) {
    //     int x =5;
    //     System.out.println(x);
    //     change(x);
    //     System.out.println(x);
    // }

    // public static void change(int x){
    //     x=10;
    // }

  

// here we can see the x is not changing  when we are  calling it
// because it will create two memory blocks

public static void main(String[] args) {
    int[] arr = {10,20,30,40};
  System.out.println(arr[0]);
   change(arr);
   System.out.println(arr[0]);
}

public static void change(int [] x){  // yha int lgana mat bhulna
        x[0]=90;
    }



// here we can see the x is changing when we are  calling it
// because it is pass by reference due to array



// imp*: when you passed an array as argument to a method what actaually passed
//is java reference variable



}