@FunctionalInterface
public interface Sum2 {

    public int add(int num1, int num2);

    static void staticMethod() {
        System.out.println("This is a static method in the interface...");
    }

}
