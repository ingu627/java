public class App {

    /*
    -> singleton pattern restricts the instantiation of a class and ensures that only
    one instance of the class exists in the java irtual machine.

    -> the singleton class must provide a global access point to get the instance of the class.

    -> singleton pattern is used for logging, drivers objects, caching and thread pool.
     */

    public static void main(String[] args) {

        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.show();

    }
}
