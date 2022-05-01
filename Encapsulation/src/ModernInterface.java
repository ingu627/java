public interface ModernInterface {

    // classic interface method (abstract method)
    public void abstractMethod();

    // static method
    public static void staticMethod() {
        System.out.println("This is a static method in the interface ...");
    }

    // default method
    public default void defaultMethod() {
        System.out.println("This is a default method in the interface ...");
    }
}
