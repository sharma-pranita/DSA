package Function;

public class fun3 {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    
    //  temp = a;
    //  a = b;
    // b = temp;
    // System.out.println(a + " " + b);
    swap(a,b);
    System.out.println(a + " " + b);

  }

  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }
}
