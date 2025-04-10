package Array_1;

public class Max_Array {

  public static void main(String[] args) {
    int[] arr = { 4, 9, 7, 3 };
    System.out.println(max(arr));
  }

  static int max(int[] arr) {
    int Max = arr[0];
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] > Max) {
        Max = arr[i];
      }
    }
    return Max;
  }
}
