public class App4 implements OuterInterface.NestedInterface, OuterClass.NestedClassInterface {

    /*
    Abstraction - Nested Interface

    An interface which is declared inside another interface or class is called nested (or inner) interface. The
    nested interfaces are used to group related interfaces so that they can be easy to maintain. The nested
    interface must  be referred  by the outer interface or class. It can't be accessed directly.

     */

    public static void main(String[] args) {

        OuterInterface.NestedInterface msg = new App4();
        msg.messageInside();

        OuterClass.NestedClassInterface show = new App4();
        show.show();

    }

    @Override
    public void messageInside() {
        System.out.println("This is a method within a nested interface");
    }

    @Override
    public void show() {
        System.out.println("This is the show method within the OuterClass's interface...");
    }
}
