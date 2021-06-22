package Infy;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        //Collection al = new ArrayList();
        //List al = new ArrayList();
        ArrayList al = new ArrayList();
        System.out.println(al.size());
        al.add(10);
        al.add(20);
        al.add("Sachin");
        al.add('s');
        al.add(234.567);
        al.add(34.6f);

        System.out.println(al);

        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("------------------");

        for (Object x : al) {
            System.out.println(x);
        }
        System.out.println("------------------");
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        al1.add(500);

        for (Integer x : al1) {
            System.out.println(x);
        }

        al1.add(3, 600);
        System.out.println(al1);

        al.addAll(al1);
        System.out.println(al);

        al.addAll(2, al1);
        System.out.println(al);

        //al1.clear();
        //System.out.println(al1);
        //al1.add(2000);
        System.out.println(al1);
        System.out.println(al1.isEmpty());
        System.out.println(al.contains("Sachin"));
        System.out.println(al.containsAll(al1));

        al1.remove(0);
        System.out.println(al1);

        System.out.println(al1);
        System.out.println(al);
        al.removeAll(al1);
        System.out.println(al);


        System.out.println(al1);
        al1.remove(0);
        System.out.println(al1);

        System.out.println(al.size());

        Object[] array = al.toArray();

        System.out.println(al);
        System.out.println(al.get(5));

        al.set(5, 3000);

        System.out.println(al);


    }
}
