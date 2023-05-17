public class App {

    /*

    Similar to a class: a collection of abstract methods
        A class can 'implements' an interface
            ~ inheriting the methods of the interface

                CONTAINS BEHAVIOR OF A CLASS

            - it can have as many methods as we want
            - no implementation (it is true prior to JDK 8)
            - we can not instantiate an interface

            Why is it good?
                Because a class can extends a single class
                    BUT can implement several interfaces

            UPDATE : Prior to JDK 8, interface could not define implementation
                We can now add default implementation for interface methods

                    Now interfaces may have following method types:
                        - abstract methods
                        - default methods
                        - static methods

     */

    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.move();
        dog.eat();

    }
}
