//Wrapper class is used to convert primitive data type to object and object to primitive data type.
//While using collection framework use Integer class and while using loops then primitive data types use for speed.

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        int i=5;                    //This is Primitive data type.
        Integer ii=new Integer(i);  //Boxing
        Integer jj=i;               //AutoBoxing

        int j=jj.intValue();       //UnBoxing
        int k=jj;                  //AutoUnboxing

        ArrayList<Integer> l=new ArrayList<>();
        l.add(5);
        l.add(7);
        l.add(Integer.valueOf(k));
        System.out.println(l);

    }
}
