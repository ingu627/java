// 메서드 인자로 람다식(함수형 인터페이스) 사용
public class B008 {
    public static void main(String[] args) {
        doIt(a -> a * a);
    }

    public static void doIt(MyFunctionalInterface mfi) {
        int b = mfi.runSomething(8);

        System.out.println(b);
    }
}
