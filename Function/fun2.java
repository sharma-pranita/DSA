package Function;

import java.util.Scanner;

public class fun2 {
    

    public static void main(String[] args) {
    //   msg("Hello");  
    // Scanner Str = new Scanner(System.in);
    // System.out.println("Enter the message : ");
    // String msg = Str.nextLine();
    // msg(msg);


    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String name = in.next();

    System.out.println(msg(name));
    }

    static String msg(String name){
        String message = ("Hello "+name);
        return message;
    }
}
