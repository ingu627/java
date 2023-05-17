public class Car {

    private int speed;
    private String nameOfOwner;

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this+" object cleaned from heap memory...");
    }
}
