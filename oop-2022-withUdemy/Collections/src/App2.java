import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App2 {

    /*
    Sets

    You use a set when you don't want to allow duplicate entries. Both of the sets are not synchronized. main
    methods: add, remove, contains, etc.

    HashSet - LinkedHashSet - TreeSet

    A HashSet stores its elements in a hash table. This means that uses the hashCode() method of the objects to
    retrieve them more efficiently. HashSet is the most common set!

    LinkedHashSet : If you need a HashSet that can be store items by the insertion order

    A TreeSet stores its elements in a sorted tree structure. The main benefit is that the set is always in
    sorted order. treeSet is slower than HashSet.

     */

    public static void main(String[] args) {

//        Set<Integer> hashSet = new HashSet<>();
//        Set<Integer> hashSet = new LinkedHashSet<>();
//        Set<Integer> hashSet = new TreeSet<>();

        Set<Integer> hashSet = new HashSet<>();

//        hashSet.add(10);
//        hashSet.add(20);
//        hashSet.add(30);
//        hashSet.add(40);
        hashSet.add(100);
        hashSet.add(22);
        hashSet.add(3);
        hashSet.add(40);
        hashSet.add(51);
        hashSet.add(29);

        // HashSet을 이용해서 정렬하고 싶을 때
        Set<Integer> sortedSet = new TreeSet<>(hashSet);


//        hashSet.remove(10);

//        System.out.println(hashSet.contains(100));

//        for(Integer num : hashSet)
//            System.out.println(num);

        for(Integer num : sortedSet)
            System.out.println(num);




    }
}
