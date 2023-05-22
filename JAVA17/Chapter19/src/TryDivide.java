public class TryDivide {
    public static void main(String[] args) {
        int a=2;
        int b=0;
        int c;
        try {
            c = a/b;
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생");
        }
        System.out.println("프로그램 실행 완료");
    }
}
