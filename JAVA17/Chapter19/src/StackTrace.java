public class StackTrace {
    public static void main(String[] args) {
        method();
    }

    static void method() {
        submethod();
    }

    static void submethod() {
        int i;
        int a=3, b=0;
        try {
            i = a/b;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
