public class ComparableTest {
    static <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int result = ComparableTest.max(1, 2);
        System.out.println(result);
    }
}
