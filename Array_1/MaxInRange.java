package Array_1;

public class MaxInRange {

  public static void main(String[] args) {
    int[] arr = {};

    System.out.println(MaxInRange(arr, 2, 6));
  }

  static int MaxInRange(int[] arr, int start, int end) {
    if (arr == null || arr.length == 0 || start<0 || end>=arr.length|| start>end ) {
    return -1;
    }

    
    int max = arr[start];
    for (int i = start+1; i <= end+1; i++) {
      if (arr[i] > start) {
        max = arr[i];
      }
    }

    return max;
  }
}
