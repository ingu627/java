public class App {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        if (cat instanceof Mammals) {
            System.out.println("Cat is an mammals...");
        }
    }
}
