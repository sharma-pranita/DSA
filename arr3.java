package DSA;

public class arr3 {

  public static int linearSearch(int arr3[],int key) {
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] == key) {
     return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr3[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    int key = 10;
    // for (int i = 0; i < arr3.length; i++) {
    //   if (arr3[i] == 10) {
    //     System.out.println(i);
    //   }
   System.out.println( linearSearch(arr3,key));
  }
}
