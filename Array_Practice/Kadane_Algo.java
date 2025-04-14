import java.util.Arrays;

public class Kadane_Algo {

  public static void main(String[] args) {
    int[] arr = { 0, -3, 1, -5, 1, 0, 1 };
    MaxSub(arr);
  }

  static void MaxSub(int[] arr) {
    int MaxSum = arr[0];
    int CurSum = arr[0];
    int start = 0;
    int end = 0;
    int tempStart = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > CurSum + arr[i]) {
        CurSum = arr[i];
        tempStart = i;
      } else {
        CurSum += arr[i];
      }

      if (CurSum > MaxSum) {
        MaxSum = CurSum;
        start = tempStart;
        end = i;
      }
    }

    int[] subArr = { start, end };
    System.out.println(
      "the max sum is : " +
      MaxSum +
      " and the max sum sub array indices are " +
      Arrays.toString(subArr)
    );
  }
}
