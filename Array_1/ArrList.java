package Array_1;
import java.util.ArrayList;
import java.util.Scanner;



public class ArrList {
    public static void main(String[] args) {
       

    // List.add(21);
    // List.add(11);
    // List.add(91);
    // List.add(51);
    // List.add(24);
    // List.add(15);
    // List.add(87);

   
    // System.out.println(List.contains(11));
    // List.set(2,33);
    // System.out.println(List.get(2));
    


//     for(int i =0;i<List.size();i++){
//   System.out.println(List.get(i));
//     }

ArrayList<Integer> List = new ArrayList<>(10);
//Input
Scanner in = new Scanner(System.in);

for(int i = 0; i<10;i++){
    System.out.print("Enter the 10 array elements: ");
    List.add(in.nextInt());

}

for(int i = 0;i<List.size();i++){
    System.out.println(List.get(i));
}

    }
}
