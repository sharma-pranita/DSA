package DSA;

import java.util.*;

public class arr2 {


    //java always uses call by value(for primitive datatypes)
    
  public static void nonChangeable(int n) {
    n = n + 2;
  }


  //Arrays are always called by reference in java
  //means if we change the value of array in other function,its main value will also change.
  //means it makes the shallow copy
  public static void update(int arr1[]) {
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = arr1[i] + 1;
    }
  }

  public static void main(String[] args) {
    // int arr1[] = {32,33,34};
    // update(arr1);
    // for(int i = 0; i<arr1.length;i++){
    //     System.out.println(arr1[i]);
    // }
    int n = 5;
    nonChangeable(n);
    System.out.println(n);
  }
}
