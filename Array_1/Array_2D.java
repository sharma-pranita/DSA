package Array_1;
import java.util.*;
public class Array_2D {
    public static void main(String[] args) {
        // int[][] arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        // System.out.println(Arrays.deepToString(arr));

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][2];

   

        
        for(int i=0 ; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter the arr of index ["+i+"]["+j+"]");
                arr[i][j] = in.nextInt();
                
            }
        }

        // for(int i=0 ; i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //        System.out.print(arr[i][j]+" ");
                
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        for(int[] mulArr : arr){
            System.out.println(Arrays.toString(mulArr));
        }
    }
}
