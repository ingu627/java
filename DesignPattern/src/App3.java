public class App3 {

    /*
    Factory pattern is one of the most used design patterns in Java

    -> it is about using a factory class to produce instances
    of objects based on a set of input parameters

    -> it is similar to the builder pattern although it is focused on supporting class polymorphism

    In Factory pattern, we create object without exposing the creation logic
    to the client and refer to newly created object using a common interface
     */

    public static void main(String[] args) {

        Animal elephant = AnimalFactory.getAnimal("ELEPHANT");
        elephant.run();
    }
}
