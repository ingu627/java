public class Dog implements Animal, Mammal {
    @Override
    public void move() {
        System.out.println("Dog is moving...");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
