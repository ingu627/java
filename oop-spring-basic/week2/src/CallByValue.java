public class CallByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        b = 20;

        System.out.println(a);
        System.out.println(b);
    }
}
