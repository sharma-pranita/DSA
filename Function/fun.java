package Function;

import java.util.Scanner;

public class fun{

  public static void main(String[] args) {
    System.out.println(sum1());
  }

static int sum1(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a = in.nextInt();
    System.out.println("Enter the value of b");
    int b = in.nextInt();
    int sum = a + b;
    return sum;
    // System.out.println();
}

  static void sum() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a = in.nextInt();
    System.out.println("Enter the value of b");
    int b = in.nextInt();
    int sum = a + b;
    System.out.println("Sum is : " + sum);
  }
}
