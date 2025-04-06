package Function;

public class Armstrong {

  public static void main(String[] args) {
    // Armstrong(153);
    printArmstrong();
  }

  //   static void Armstrong(int n) {
  //     int sum = 0;
  //     int number = n;

  //     for (int i = 1; i <= 3; i++) {
  //       int remainder = number % 10;

  //       sum = sum + (int) Math.pow(remainder, 3);
  //       number = number / 10;
  //     }
  //     System.out.println(sum);
  //     if (sum == n) {
  //       System.out.println("n is an Armstrong no.");
  //     } else {
  //       System.out.println("n is not an armstrong no.");
  //     }
  //   }

  static void printArmstrong() {
    for (int n = 100; n <= 999; n++) {
      int sum = 0;
      int number = n;
      while(number>0) {
        int remainder = number % 10;

        sum = sum + (int) Math.pow(remainder, 3);
        number = number / 10;
      }
      if(sum==n){
        System.out.println(n);
      }
    }
  }
}
