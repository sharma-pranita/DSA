package DSA;
import java.util.*;

public class arr1 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int marks[] = new int[20];
    System.out.println("Enter the marks of phy: ");
    marks[0] = scn.nextInt();
    System.out.println("Enter the marks of chem: ");
    marks[1] = scn.nextInt();
    System.out.println("Enter the marks of math: ");
    marks[2] = scn.nextInt();

    // System.out.println("Marks of phy is : "+marks[0]+", Marks of chem is "+marks[1]+", Marks of math is "+marks[2]);
    System.out.println(marks.length);
  }
}
