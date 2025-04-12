package Array_Practice;

public class Missing_Number {

  public static void main(String[] args) {
    int[] arr = { 0, 1, 4, 5, 2, 3 };
    System.out.println(MissingNo(arr));
  }

  static int MissingNo(int[] arr) {
    int n = arr.length;
    int expectedSum = (n * (n + 1)) / 2;
    int actualSum = 0;
    for (int sum : arr) {
      actualSum+=sum;
    }
    
    int Missing_Number = expectedSum - actualSum;


    if (expectedSum == actualSum ) {
        System.out.println("No missing number");
    } else {
        System.out.println("Missing number is: " + Missing_Number);
    }
    return Missing_Number;
  }
}
