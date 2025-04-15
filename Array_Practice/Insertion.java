package Array_Practice;

import java.util.Arrays;

public class Insertion {

  public static void main(String[] args) {
    int[] arr = { 0, 3, 6, 8, 2 };
    int index = 2;
    int element = 9;

    Insertion(arr, index, element);
  }

  static void Insertion(int[] arr, int index, int element) {
    int[] newArr = new int[arr.length + 1];
    for (int i = 0; i <= arr.length; i++) {
      if (i < index) {
        newArr[i] = arr[i];
      } else if (i == index) {
        newArr[i] = element;
      } else {
        newArr[i] = arr[i - 1];
      }
    }

    System.out.println(Arrays.toString(newArr));
  }
}
