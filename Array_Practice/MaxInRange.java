package Array_Practice;

public class MaxInRange {

  public static void main(String[] args) {
    int[] arr = {1,2,10,6,8,9,3,5};

    System.out.println(MaxInRange(arr, 2, 6));
  }

  static int MaxInRange(int[] arr, int start, int end) {
    if (arr == null || arr.length == 0 || start<0 || end>=arr.length|| start>end ) {
    return -1;
    }

    
    int max = arr[start];
    for (int i = start+1; i <= end; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    return max;
  }
}
