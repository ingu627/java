import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App3 {

    /*
    Maps

    Map can store pairs of keys and values. Each key is linked to a specific value. Once stored in a Map,
    you can later look up the value using just the key.

    HashMap - Hashtable - LinkedHashMap - TreeMap

    HashMap doesn't allow duplicate keys but allows duplicate values. HashMap is implemented as a hash table,
    and there is no ordering on keys or values. Hashtable is quite similar to HashMap. The main difference is
    that HashMap is not synchronized (not thread-safe), therefore it's faster and uses less memory than Hashtable.
    Hashtable is slower, but it's synchronized (thread-safe). + Hashtable doesn't allow duplicate values.

    LinkedHashMap preserves the insertion order

    A TreeMap stores the keys in a sorted tree structure. The main benefit is that the keys are alwyas in sorted order.

    Main methods:

    Object put(Object k, Object v) Puts an entry in the invoking map, overwriting any previous value associated with the key
    get(Object k) Returns the value associated with the key k.
    int size() Returns the number of key/value pairs in the map.
    clear() Removes all key/value pairs from the invoking map. etc.

     */

    public static void main(String[] args) {

//        Map<Integer, String> map = new HashMap<>();
//        Map<Integer, String> map = new LinkedHashMap<>();
        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Adam");
        map.put(155, "Joe");
        map.put(90, "Tom");
        map.put(30, "Adam");
        map.put(10, "Kate");
        map.put(10, "Judy");

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey()+"-"+entry.getValue());



    }


}
