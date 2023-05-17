public class App3 implements ModernInterface, AnotherInterface {

    /*
    Modern Interface
    Originally an interface could only have abstract methods, but with JDK 8 changes have come. From JDK 8 the
    interface body can contain abstract methods, default methods, and static methods too.

     */

    public static void main(String[] args) {

        App3 app = new App3();
        app.abstractMethod();

        ModernInterface.staticMethod();
        app.defaultMethod();

        /*
        Multiple Defaults

        with default functions in interfaces, there is a possibility that a class is implementing two interfaces
        with same dafault methods.

        1. We can override
        2. We can call the default method of the specified interface using super!!

         */

    }

    @Override
    public void abstractMethod() {
        System.out.println("Abstract interface method from the App class ...");
    }

    @Override
    public void defaultMethod() {
        AnotherInterface.super.defaultMethod();
    }
}
