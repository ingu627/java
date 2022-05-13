import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

//        ArrayList<String> arrayList = new ArrayList();

        //Object

//        arrayList.add(12);
//        arrayList.add("Adam");
//
//        int num = (int) arrayList.get(0);
//        String name = (String) arrayList.get(1);

//        arrayList.add("Adam");
//
//        String name = arrayList.get(0);


//        String[] names = {"Adam", "Kevin", "Joe"};
//
//        printArray(names);

        Integer[] nums = {10,20,30,40};
        String[] names = {"Adam", "Kevin", "Joe"};

        printArray(names, nums);

    }

    public static <T,V>void printArray(T[] t, V[] v) {

        System.out.println("First array's value:\n");

        for(T value : t)
            System.out.println(value);

        System.out.println("Second array's value:\n");

        for(V value : v)
            System.out.println(value);
    }

//    public static void printArray(String[] t) {
//
//        for(String value : t)
//            System.out.println(value);
//    }
}
