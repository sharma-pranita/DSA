package Function;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        // fun(1,62,32,23,54,67);
        multiple(1, 2, "Pranita","Sharma");
    }


    static void multiple(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
