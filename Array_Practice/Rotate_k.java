package Array_Practice;

import java.util.Arrays;


public class Rotate_k {

  public static void main(String[] args) {
    int[] arr = { 3, 2, 6, 0, 5, 1, 2, 9, 12 };
    int k = 3;
    Rotate(arr, k);

    System.out.println(Arrays.toString(arr));
  }

  static void Rotate(int[] arr, int k) {
    int n = arr.length;
    k = k % n; //in case k>n

    Reverse(arr, 0, n - k - 1);

    Reverse(arr, n - k, n - 1);

    Reverse(arr, 0, n - 1);
  }

  static void Reverse(int[] arr, int start, int end) {
  

    while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
   
  }
}
