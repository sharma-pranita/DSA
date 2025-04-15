package Array_Practice;
import java.util.Arrays;
public class Deletion {

  public static void main(String[] args) {
    int[] arr = { 2, 3, 6, 9, 15, 10 };
    int index = 4;
    Delete(arr,index);
   
  }

  static void Delete(int[] arr , int index){
      int[] newArr = new int[arr.length - 1];
      for(int i = 0 ; i<arr.length ; i++){
          if(i < index){
              newArr[i] = arr[i];

          }

          else if(i > index){
              newArr[i-1] = arr[i];
          }
      }

      System.out.println(Arrays.toString(newArr));
  }

 
}
