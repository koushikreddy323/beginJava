import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String > hm=new HashMap<>();
        hm.put(1,"Renault");
        hm.put(3,"Mercedes");
        hm.put(4,"Ferrari");
        hm.put(5,"Redbull");
        System.out.println("All Key-Value pairs in Hashmap...");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+"  "+m.getValue());
        }
        System.out.println("After invoking the putIfAbsent method...");
        hm.putIfAbsent(2,"Aston Martin");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+"  "+m.getValue());
        }
        HashMap<Integer,String> map=new HashMap<>();
        map.put(5,"Hass");      //Does not add to map because hashmap does not have duplicate records.
        map.put(6,"McLaren");
        map.putAll(hm);
        System.out.println("After adding all the elements in hm to new map...");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+"  "+m.getValue());
        }
    }
}
