package Array_Practice;

public class Max_Array {

  public static void main(String[] args) {
    int[] arr = {};
    System.out.println(max(arr));
  }

  static int max(int[] arr) {
    if (arr.length == 0 || arr == null) {
      return -1;
    }
    int Max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > Max) {
        Max = arr[i];
      }
    }
    return Max;
  }
}
