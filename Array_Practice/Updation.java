package Array_Practice;

import java.util.Arrays;

public class Updation {
    public static void main(String[] args) {
        int[] arr = {0,6,5,1,3,9};
        int element = 10;
        int index  = 2;
        Update(arr,index,element);
    }

    static void Update(int[] arr,int index, int element){
        for(int i = 0 ; i<= index ; i++){
            if(i == index){
                arr[i] = element;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
