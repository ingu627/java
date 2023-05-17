import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

    /*
    ArrayList (AL) vs LinkedList (LL) main differences

    1.) AL act as a list, LL act as a list and queue both

    2.) AL use dynamic array to store the elements <> LL use doubly linked list to store the elements

    3.) Manipulation: AL slow, because if any element is removed from the array,
    all the bits are shifted in memory, LL faster because it uses a doubly linked
    list, so no bit shifting and accessing data, LL is better for manipulating data

    4.) AL better for storing and accssing data, LL is better for manipulating data
     */

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>(); // creating ArrayList
        List<String> linkedList = new LinkedList<>(); // creating LinkedList

        // adding object in ArrayList
        arrayList.add("Kevin");
        arrayList.add("Joe");
        arrayList.add("Peter");
        // adding object in LinkedList
        linkedList.add("Kate");
        linkedList.add("Judy");
        linkedList.add("Julia");

        // iterate through with Iterator
        Iterator<String> arrayIterator = arrayList.iterator();
        System.out.println("ArrayList elements: ");

        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        System.out.println();

        // iterate through with for-each loop
        System.out.println("LinkedList elements: ");

        for (String s : linkedList) {
            System.out.println(s);
        }

    }

}
