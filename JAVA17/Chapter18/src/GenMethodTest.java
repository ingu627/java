public class GenMethodTest {
    public static void main(String[] args) {
        GenMethodTest.<Integer>print(1234);
        GenMethodTest.<String>print("문자열");
    }

    static <T> void print(T a) {
        System.out.println(a);
    }
}
