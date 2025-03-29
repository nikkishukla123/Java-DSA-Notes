package Array;  // given marks of student if it is less than 35 print its roll number means its index

public class marks {
    public static void main(String[] args) {
        int[]arr = {50,30,40,20,90};
        for(int i=0; i<arr.length; i++){ // i kab tak chalega jab tak less than hai array ki lengh sa
            if(arr[i]<35)
           {
            System.out.print(i +" ");  // print that index
           }
        }
    }
}
