
import java.util.Arrays;

public class Move_zeros {

  public static void main(String[] args) {
    int[] arr = { 0, 5, 3, 2, 0, 1, 0, 6, 9 };
    // MoveZero(arr);
    OptMoveZero(arr);
  }

  // static void MoveZero(int[] arr){
  //     int end = arr.length - 1;
  //     for(int i = 0 ; i< arr.length ; i++){
  //     if(arr[i]==0 && arr[i] != arr[end]){
  //         int temp = arr[i];
  //         arr[i] = arr[end];
  //         arr[end] = temp;
  //         end--;
  //     }
  //     }
  //     System.out.println(Arrays.toString(arr));
  // }

  static void OptMoveZero(int[] arr) {
    int index = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[index++] = arr[i];
      }
    }
    while (index < arr.length) {
      arr[index++] = 0;
    }

    System.out.println(Arrays.toString(arr));
  }
}
