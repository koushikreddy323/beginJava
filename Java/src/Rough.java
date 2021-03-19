//if the array values are fixed then use array if not use collections.
//The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
//A framework is a ready made architecture which has classes and interfaces.
//interfaces:set,list,Queue
//Classes:ArrayList,Vector,LinkedList,Hashset
//Difference between ArrayList and Vector is :        ArrayList<Integer> a=new ArrayList<>();   --Creates 50% of original size if array extends // Non Thread safe // Fast
//                                                    Vector <Integer> v=new Vector<>();        --Creates 100% of original size if array extends // Thread safe // slow
// ArrayList is preferable always. Use vector only when specifically asked for.


import java.util.*;

public class Rough {
    public static void main(String[] args) {
        Collection<Integer> values = new ArrayList<>();       //Collection is collection and <Integer> is a generic ----and Collection is an interface. we cannot instantiate an interface so a class is used ArrayList.
        values.add(10);
        values.add(20);

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(52);
        nums.add(20);                      //Collection dont have add method that takes two parameters so we use List which takes index values
        nums.add(2);
        Collections.sort(nums);          //Sorting the array by using collections class
//        System.out.println(nums.contains(20));
//        System.out.println(nums.indexOf(52));

        Vector <Integer> v=new Vector<>();
        v.add(20);
        v.add(21);
        v.add(85);
//        System.out.println(v.capacity());
//        System.out.println(v);

        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(10);
        s.add(45);
        s.add(23);
//        Iterator <Integer> it=s.iterator();        //Printing the values using iterator
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }


        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(42);
        a.add(32);
        System.out.println(a.size());


    }
}
