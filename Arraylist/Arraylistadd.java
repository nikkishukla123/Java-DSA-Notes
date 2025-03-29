package Arraylist;

import java.util.ArrayList;

public class Arraylistadd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list+" "+list.size()); // empty if we print in array it will give error out of index rather than this
        list.add(20);
        System.out.println(list+" "+list.size());
        list.add(50);
        list.add(60);
        list.add(90);
        System.out.println(list+" "+list.size());
        list.remove(3);
        System.out.println(list+" "+list.size());
    }
}
