package Array_Practice;

import java.util.Arrays;

public class Target_Sum {
    public static void main(String[] args) {
        int[] arr = {5,2,9,8,3};
        int target = 5;
        Target(arr,target);
    }

    static void Target(int[] arr,int target){
       
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++ ){
                int targetSum = arr[i] + arr[j];
                if(targetSum == target){
                    int[] targetIndices = {i,j};
                    System.out.println(Arrays.toString(targetIndices));
                } 
            }
           
        }
        
    }
}
