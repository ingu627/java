import java.util.Arrays;

interface FunctionalInterface {
    public void show();
}

interface FunctionalInterface2 {
    MessageClass showMessage(String str);
}

public class App {
    /*
    Method References

    There are four kinds of method references:

    1.) Referene to a Static Method
    2.) Reference to an Instance Method of a Particular Object
    3.) Reference to an Instance Method of an Arbitrary Object of a Particular Type
    4.) Reference to a Constructor

     */

    public static void main(String[] args) {

        //1.)
        FunctionalInterface functionalInterface = App::staticGreeting;
        functionalInterface.show();

        //2.)
//        App app = new App();
//        FunctionalInterface functionalInterface2 = app::instanceGreeting;
        FunctionalInterface functionalInterface2 = new App()::instanceGreeting;
        functionalInterface2.show();

        //3.)
        String[] names = {"Kevin", "Alan", "Adam", "Joe", "Kate"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

        //4.)
        FunctionalInterface2 interface2 = MessageClass::new;
        interface2.showMessage("This is a message...");


    }

    public static void staticGreeting() {
        System.out.println("Greeting from a static method...");
    }

    public void instanceGreeting() {
        System.out.println("This is a greeting from an instane method...");
    }



}
