package jump_to_java;
/**
 * Sample
 */
public class Sample {

    public int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Sample sample = new Sample();
        int c = sample.sum(a, b);

        System.out.println(c); // 7
    }
}