//one way of using comparator interface is by overriding the compare method in obj creation and the other way is by using lambda expression at obj creation.
//Use anonymous and lambda expression only when the code is used once.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Integer> values =new ArrayList<>();
        values.add(102);
        values.add(541);
        values.add(658);
        values.add(326);

        //By using Anonymous inner class
       /* Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10){
                    return 1;         //Return 1 is to swap
                }
                return -1;           //Return -1 to not swap
            }
        };

        */

        //By using Lambda expression
        Comparator<Integer> com= (o1,o2)-> {
//                if(o1%10>o2%10){
//                    return 1;         //Return 1 is to swap
//                }
//                return -1;           //Return -1 to not swap
                  return o1%10>o2%10?1:-1;  //Ternary operator
        };

        Collections.sort(values,com);      //We can replace with values(which is a list).

        for(int item:values){
            System.out.println(item);
        }

    }
}
