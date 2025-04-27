package Strings;

import java.util.ArrayList;

public class str {
    
    public static void main(String[] args) {
        System.out.println("a" + "b");
        System.out.println('a'+'b');
        System.out.println('a' + 3);
        System.out.println((char)('a'+3));
        System.out.println("a" + 3);
        System.out.println(3 + 6 + "a" + 6 + 3);
        System.out.println(2 - 3 + "a");
        System.out.println("a" + new ArrayList<>());
        System.out.println(new ArrayList<>() + "A");
        System.out.println("A" + new Integer(56));
        System.out.println(new Integer(89) + ""+new ArrayList<>());
    }
}
