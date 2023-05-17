import java.util.ArrayList;

public class list_23 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("peach");
        fruits.add("melon");
        fruits.add("water melon");


        int Listsize = fruits.size(); //5
        String place = fruits.get(3); //melon
        fruits.set(1, "green banana");
        fruits.remove(1);
        fruits.clear();

        System.out.println(fruits);
    }
}
