//Hashmap is not sorted while treemap is sorted in ascending order and Linked hash set is it maintains insertion order.
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,String > map=new HashMap<>();
        map.put("key1","100");
        map.put("key2","250");
        map.put("key3","50");
        for(String i:map.keySet()){            //map.keySet() gives all the keys in a set
            System.out.println(i+" "+ map.get(i));
        }
//
//        Set<Map.Entry<String ,String>> values=map.entrySet();
//        for(Map.Entry<String ,String> e:values){
//            System.out.println(e.getKey()+"  "+e.getValue());
//
//        }

// To get the key and value elements, we should call the getKey() and getValue() methods.
// The Map.Entry interface contains the getKey() and getValue() methods.
// But, we should call the entrySet() method of Map interface to get the instance of Map.Entry.



        for(Map.Entry m :map.entrySet()){
            System.out.println(m.getKey()+"   "+m.getValue());
        }

    }
}
