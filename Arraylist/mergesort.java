package Arraylist;  //merge two sorted array in one

public class mergesort {
    public static void main(String[] args) {
        int[]a = {10,20,30,40};
        int[]b = {60,70,80,90};
        int[]c = new int [a.length+b.length];

         int i=0; int j=0;int k=0;
         // merging is done here
        while(i< a.length && j < b.length){
            if(a[i]<=b[j]){  // if a is small then a is storing in c
                c[k]=a[i];
            i++;
           
            } else {
                
                    c[k]=b[j];
                    j++;
                  
                  }
             k++;
        } 
          //second part
        if(i==a.length){  // jab i end hogya and j is remaining yet
            while(j<b.length){
                c[k]=b[j]; 
                j++; k++;
             }
        }
        if(j==b.length){  // jab j end hogya and i is remaining yet
            while(i<a.length){
                c[k]=a[i]; 
                i++; k++;
             }
        }
        for(int ele:c){
            System.out.println(ele);
        }

    }
}
// do array ki size ke jitne c array ki size bnana
// first part mein jab tak array is not out of index till that loop is going on and storing its value is in c
// in sec part if any one of loop is end and other is remaining then  remaing value stored in directly c