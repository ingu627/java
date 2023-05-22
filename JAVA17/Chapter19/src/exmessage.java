public class exmessage {
    public static void main(String[] args) {
        int a, b, c;
        a=2;
        b=0;
        try {
            c= a/b;
            System.out.println("c = "+c);
        } catch (java.lang.ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }
}
