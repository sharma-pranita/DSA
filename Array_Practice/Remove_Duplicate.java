package Array_Practice;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] arr = {0,1,3,3,6,8,8,9};
        Remove(arr);
    }

    static void Remove(int[] arr){
        int i=0;
        for(int j = 1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                ++i;
                arr[i] = arr[j];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0, i+1)));
       
    }
}
