package TwoDimensionalArray;

public class foreach {
    public static void main(String[] args) {
//         int[] a ={4,5,6,8};
//         for(int ele:a){
//             System.out.println(ele+" ");
//         }
// System.out.println();

    //1 2 3
    //4 5 6
    //7 8 9
    int[][] b ={{1,2,3},{4,5,6}};
    for(int[] ele: b){    // this is printing array  not eleement
        for(int x:ele){      // now printing elements  ele matlab array jo ki b mein hai so using ele
            System.out.print(x);
        }
        System.out.println();
    }











    }
}
