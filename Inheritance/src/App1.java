public class App1 {
    public static void main(String[] args) {

//        Child child = new Child();
//        child.parentMethod();
//        child.childMethod();
//
//        GrandChild grandChild = new GrandChild();
//        grandChild.childMethod();
//        grandChild.parentMethod();
//        grandChild.grandChildMethod();
//
//        MultipleInterfaces multipleInterfaces = new MultipleInterfaces();
//        multipleInterfaces.interfaceMethod1();
//        multipleInterfaces.interfaceMethod2();

        HybridClass hybridClass = new HybridClass();
        hybridClass.interfaceMethod1();
        hybridClass.interfaceMethod2();
        hybridClass.parentMethod();

    }
}
