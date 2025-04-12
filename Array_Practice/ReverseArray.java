package Array_Practice;

import java.util.Arrays;

public class ReverseArray {

  public static void main(String[] args) {
    int[] arr = { 1,3,6,5,0,2};
    System.out.println(Arrays.toString(reverse(arr)));
  }

  static int[] reverse(int[] arr) {
    int mid = arr.length/2;
    for (int i = 0; i < mid; i++) {
    int temp = arr[i];
      arr[i] = arr[(arr.length - 1) - i];
      arr[(arr.length - 1) - i] = temp;
    }

    return arr;
  }
}
