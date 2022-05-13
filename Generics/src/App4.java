import java.util.ArrayList;
import java.util.List;

public class App4 {

    /*
    Generics unbounded wildcard example

    Unbounded wildcard type is specified using the wildcard character (?). This is called a list of unknown
    type. These are useful in the following cases:

    1. When writing a method which can be employed using functionality provided in Object class

    2. When the code is using methods in the generic class that don't depend on the type paramter

    List<?> list
     */

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Adam");
        list1.add("Kevin");
        list1.add("Joe");

        printAll(list1);
    }

    public static void printAll(List<?> list) {
        for(Object item : list)
            System.out.println(item);
    }
}
