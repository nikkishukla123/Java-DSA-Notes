package Array;

public class basicsyntax {
    public static void main(String[] args) {
        int[]arr = new int[5];  // array initialization
        // initializing individual elements
        arr[0]=1;
        arr[1]=5;
        arr[2]=90;
        arr[3]=100;
        arr[4]=20;
        //outout of array
        System.out.println(arr[0]);

        // updation
        arr[0]=99;
        //adding
        arr[0]+=10;

        System.out.println(arr[0]);
    }
}
