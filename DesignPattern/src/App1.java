import java.util.ArrayList;
import java.util.List;

public class App1 {

    /*
    Sometimes we want to create simple objects that can be shared across multiple classes
    but for security reasons we don't want their value to be modified

        -> we could copy the object before sending it to another method but this creates a large
        overhead that duplicates the object every time it is passed

            Immutable object pattern makes sure the state of an object will not change

        -> we can achieve this pattern via encapsulation
        -> this pattern is inherently thread-safe (because immutable objects never change)

     */

    public static void main(String[] args) {

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Peter");
        friends.add("Adam");
        friends.add("Joe");

        Person person = new Person("Kevin", 30, friends);

        System.out.println(person.getName()+"-"+person.getAge()+"-"+person.getFriends());

//        person.getFriends().clear();
//        person.getFriends().add("New Friend");

        System.out.println(person.getName()+"-"+person.getAge()+"-"+person.getFriends());

    }
}
