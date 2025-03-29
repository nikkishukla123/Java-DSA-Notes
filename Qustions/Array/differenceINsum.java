package Qustions.Array;

public class differenceINsum {
    public static void main(String[] args) {
        int[]arr = {5, 8, 2, 10, 4, 7};
        int evensum = 0;
        int oddsum = 0;

        for(int i=0; i<arr.length; i++){
              if(i%2==0){
                evensum+=arr[i];
              } else {
                oddsum+=arr[i];
              }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
        int c = evensum - oddsum;
        System.out.println("difference"+c);
    }
}
//9. Find the difference between the sum of elements at even indices to the sum of elements at odd indice
// first finding odd and even i and then sutituting array value of i in rifght variable
//then doing minus