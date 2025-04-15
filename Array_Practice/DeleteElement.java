package Array_Practice;

import java.util.Arrays;

public class DeleteElement {

  public static void main(String[] args) {
    int[] arr = { 1, 10, 9, 6, 10, 5, 10 };
    int element = 10;
    Delete(arr, element);
  }

  static void Delete(int[] arr, int element) {
    int count = 0;
    for (int num : arr) {
      if (num == 10) {
        System.out.println(count);
        count++;
      }
    }

    int[] newArr = new int[arr.length - count];


    int index = 0;
    for (int num : arr) {
      if (num != 10) {
        newArr[index++] = num;
        // index++;
      }
    }
    System.out.println(Arrays.toString(newArr));
  }
}
