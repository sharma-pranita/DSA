package Strings;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "Pranita Sharma";
        System.out.println(name.charAt(0));
        System.out.println(name.contains("z"));
        System.out.println(name.concat("Hello"));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println("   Pranita   ".trim());
        System.out.println("  Pranita   ".strip());
    }
}
