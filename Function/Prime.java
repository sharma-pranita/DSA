package Function;

import java.util.*;

public class Prime {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = in.nextInt();
    System.out.println(Prime2(n));
  }

  static void Prime(int n) {
    if (n <= 1) {
      System.out.println(n + " is not a Prime no.");
      return;
    }

    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        System.out.println(n + " is not a Prime no.");
        return;
      }
    }

    System.out.println(n + " is a Prime no.");
  }

  static boolean Retprime(int n) {
    boolean isPrime = true;
    if (n <= 1) {
      isPrime = false;
      return isPrime;
    }

    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        isPrime = false;
        return isPrime;
      }
    }

    return isPrime;
  }

  static boolean Prime2(int n) {
    if (n <= 1) {
      return false;
    }

    int i = 2;
    while (i * i <= n) {
      if (n % i == 0) {
        return false;
      }
      i++;
    }
    return i * i > n;
  }
}
