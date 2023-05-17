import java.util.Optional;

public class App {

    public static void main(String[] args){

        Person person = new Person("Kevin Smith");

//        Optional<Person> personEmpty = Optional.empty();
//        Optional<Person> personOptional = Optional.of(person);
        Optional<Person> personOptional = Optional.ofNullable(person);

//        System.out.println(personOptional.get().getName());
//        System.out.println(personOptional);

//        if(personOptional.isPresent()) {
//            System.out.println("There is a non null object in the optional with value: "+personOptional.get());
//        } else {
//            System.out.println("The optional is empty...");
//        }


        // orElse() method

//        Optional<Person> o = Optional.ofNullable(new Person("Peter Parker"));
//
//        Person p = o.orElse(new Person("This is the new person object if Peter Parker is a NULL"));
//
//        System.out.println(p);

        Optional<Person> o = Optional.ofNullable(null);

        Person p = o.orElseGet(() -> giveAnotherPerson());

        System.out.println(p);



    }

    public static Person giveAnotherPerson() {
        return new Person("New Person");
    }


}
