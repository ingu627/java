public class App {

    /*
    Abstract calsses will hold common functionality
        for all classes that extend it

        For example : all animals move and breathe and reproduce
        so these can be put into the Animal Class

        abstract keyword:
            - we can have abstract methods in an abstract class: methods without body
            - if there is one abstract method: the class should be abstract as well
            - abstract class cannot be instantiated
            - a class have to inherit it to be able to use it
     */

    public static void main(String[] args) {

        Shape shape = new Rectangle();
        shape.calculateArea();
    }

}
