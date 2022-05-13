import java.util.function.*;

public class App2 {

    /*
    Any interface with a SAM (Single Abstract Method) is a functional interface, and its implementation may be
    treated as lambda expressions.

    -> But the interface may contain other methods: static and default methods

    -> there are predefined functional interfaces:
    For example: Consumer<T>, Predicate<T>, UnaryOperator<T>, Supplier<T> ...

     */

    public static void main(String[] args) {

        Sum2 sum2 = (num1, num2) -> num1+num2;

        System.out.println(sum2.add(10, 12));

        /*
        Predefined functional interfaces - Consumer<T>
         */

        // Consumer interface represents an operation that accepts a single input argument and returns no result.
        Consumer<String> cons = (st) -> System.out.println(st.toLowerCase());
        cons.accept("Java programming: Step by Step from A to Z");
        // accept: performs operation on the given argument.

        /*
        Predefined functional interfaces - Predicate<T>
         */

        // Predicate interface represents a predicate (boolean-valued function) of one argument.
        Predicate<Integer> pr = a -> (a > 10);
        System.out.println(pr.test(11));
        // test : evaluates this predicate on the given argument

        /*
        Predefined functional interfaces - UnaryOperator<T>
         */

        // It represents an operation on a single operand that returns a result of the same type as its operand
        UnaryOperator<String> str = (x) -> x.toUpperCase();
        System.out.println(str.apply("hello java"));


        /*
        It represents a supplier of results - Supplier<T>
         */

        // It represents a supplier of results
        // The supplier can be used in all contexts where there is no input but an output is expected.
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Supplier random value: "+randomValue.get());

        /*
        Predefined functional interfaces - Function<T,R>
         */

        // It represents a function that accepts one argument and returns a result.
        Function<String, String> functionExample = s -> {
            return message(s);
        };

        System.out.println(functionExample.apply("World!"));

        static String message(String s) {
            return "Hello " + s;
        };





    }


}
