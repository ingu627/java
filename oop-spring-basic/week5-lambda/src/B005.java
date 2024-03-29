// 사용자 정의 함수형 인터페이스
public class B005 {
    public static void main(String[] args) {
        MyFunctionalInterface mfi = (int a) -> {
            return a * a;
        };

        int b = mfi.runSomething(5);

        System.out.println(b);
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    public abstract int runSomething(int count);
}
