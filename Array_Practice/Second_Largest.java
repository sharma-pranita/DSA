package Array_Practice;

public class Second_Largest {

  public static void main(String[] args) {
    int[] arr = { 1, 6, 8, 9, 12, 10 };
    System.out.println(secondMax(arr));
  }

  static int secondMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    if (arr.length < 2) {
      throw new IllegalArgumentException(
        "Array must have atleast two elements."
      );
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if (arr[i] > secondMax && arr[i] != max) {
        secondMax = arr[i];
      }
    }
    return secondMax;
  }
}
