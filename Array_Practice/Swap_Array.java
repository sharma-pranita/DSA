package Array_Practice;
import java.util.Arrays;
public class Swap_Array {
    public static void main(String[] args) {
        int[] arr = {22,13,15,18};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,2);
        System.out.println("Swapped array in main function "+Arrays.toString(arr));
    }

    static void swap(int[] arr,int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
         System.out.println("Swapped array in Swap function "+Arrays.toString(arr));
    }
}
