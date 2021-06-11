//Wrapper class is used to convert primitive data type to object and object to primitive data type.
//While using collection framework use Integer class and while using loops then primitive data types use for speed.

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        int a=20;
        Integer i=a; // Integer i=Integer.valueOf(a); ----->Auto-Boxing
        Integer i1=Integer.valueOf(a); // Manual Boxing;
        System.out.println(i1);

        int b=i; // int b= i.intValue(); --> Auto-Unboxing;
        int b1=i.intValue(); // Manual Unboxing

        System.out.println(b);
        System.out.println(b1);

    }
}
