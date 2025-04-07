package Array_1;

import java.lang.reflect.Array;
import java.util.*;

public class EnhancedForLoop {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //Array for Primitive
    int[] arr = { 12, 313, 312, 44, 11, 33 };
    // for(int nums : arr){
    //     System.out.println(nums);
    // }

    // System.out.println(Arrays.toString(arr));

    //Array for Objects

    String[] str = new String[5];

    for(int i=0;i<str.length;i++){
        System.out.println("Enter the string element");
        str[i] = in.next();
    }

    System.out.println(Arrays.toString(str));

  }
}
