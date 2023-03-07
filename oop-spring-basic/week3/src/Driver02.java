interface Speakable {
    public static final double PI = 3.14159;
    public static final double absoluteZeroPoint = -275.15;

    public abstract void sayYes();
}

class Specker implements Speakable {
    public void sayYes() {
        System.out.println("I say NO!!!!");
    }
}


public class Driver02 {
    public static void main(String[] args) {
        System.out.println(Speakable.PI);
        System.out.println(Speakable.absoluteZeroPoint);

        Specker reporter1 = new Specker();
        reporter1.sayYes();
    }
}
