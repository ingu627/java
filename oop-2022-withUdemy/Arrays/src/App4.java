import java.util.*;

public class App4 {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("Adam");
        list.add("Kate");
        list.add("Joe");
        list.add("Kevin");
        list.add("Daniel");

        // it uses merge sort under the hood O(NlogN)
        Collections.sort(list);

//        List<String> list2 = new ArrayList<>();
//        list2.add("Adam");
//        list2.add("Kate");
//        list2.add("Joe");
//        list2.add("Kevin");
//        list2.add("Daniel");
//
//        System.out.println(list.equals(list2));

//        list.remove(0);
//        list.add(1, "Second Joe");
//        list.set(0, "Adamm");

//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
        System.out.println(Arrays.toString(list.toArray()));


    }
}
