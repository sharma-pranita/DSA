package Array_1;

import java.util.*;

public class practice {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];
    // arr[0]=27;
    // arr[1]=612;
    // arr[2]=21;

    // System.out.println(arr[3]);
    // System.out.println(arr[5]);
    // System.out.println(arr[6]);

    for (int i = 0; i < 5; i++) {
      System.out.println("Enter the array element "+ i);
      arr[i] = in.nextInt();
    }

    for (int i = 0; i < 5; i++) {
      System.out.println("Your array element of index " + i +" is " + arr[i]);
    }
  }
}
