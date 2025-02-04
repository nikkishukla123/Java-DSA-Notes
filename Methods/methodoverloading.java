package Methods;

public class methodoverloading {
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b,int c){  // 
        return a+b+c;
    }


    public static void main(String[] args) {
        System.out.println(add(3, 4));           // Calls the add(int, int) method
        System.out.println(add(1, 2, 3));        // Calls the add(int, int, int) method
      
    }
}
