package Array_Practice;

import java.util.Arrays;

public class First_duplicate {

  public static void main(String[] args) {
    int[] arr = { 3, 2, 4, 0, 5, 9, 8 };
    
    duplicate(arr);
  }

  static void duplicate(int[] arr) {
    int minSecondIndex = arr.length;
    int firstDuplicate = -1;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          if (j < minSecondIndex) {
            minSecondIndex = j;
            firstDuplicate = arr[j];
          }
          break;
        }
      }
    }
    int[] firstDuplicateArr = { firstDuplicate, minSecondIndex };

    System.out.println(Arrays.toString(firstDuplicateArr));
   
  }
}
