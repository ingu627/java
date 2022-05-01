public class HybridClass extends Parent implements Interface3 {

    @Override
    public void interfaceMethod1() {
        System.out.println("Interface method 1...");
    }

    @Override
    public void interfaceMethod2() {
        System.out.println("Interface method 2...");
    }

    @Override
    protected void parentMethod() {
        System.out.println("This is the parent method ...");
    }
}
