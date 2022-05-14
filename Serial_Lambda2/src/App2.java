import java.util.*;

public class App2 {

    /*
    forEach with Lambda and Method reference

    Introduced in Java 8, the forEach loop provides programmers with a new, simplified way for
    iterating over a collection.
     */

    public static void main(String[] args) {

//        List<String> names = new ArrayList<>();
//        names.add("Adam");
//        names.add("Kevin");
//        names.add("Natali");
//        names.add("Joe");
//        names.add("Brad");

//        for(String s : names)
//            System.out.println(s);

//        names.forEach(name -> System.out.println(name));

//        names.forEach(System.out::println);

        // Set
//        Set<String> set = new HashSet<>(Arrays.asList("item1", "item2", "item3"));

//        set.forEach(s-> System.out.println(s));
//        set.forEach(System.out::println);

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

//        for(Map.Entry<String, Integer> entry : map.entrySet())
//            System.out.println(entry.getKey()+"-"+entry.getValue());

        map.forEach((key,value)-> System.out.println(key+"-"+value));

        // method reference
        // items.forEach(System.out::println);
        // Error : The type PrintStream does not define println(String, Integer) that is applicable here

        /*
        we can use method reference in cases where Lambda body only contains a call to another method. But since
        there are two implicit variables (key and value) and we cannot use the below code to call println() method
        of System.out class.
         */

    }
}
