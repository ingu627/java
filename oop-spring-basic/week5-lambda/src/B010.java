// 자바 8 API에서 제공하는 대표적인 함수형 인터페이스
import java.util.function.*;

public class B010 {
    public static void main(String[] args) {
        Runnable run = () -> System.out.println("hello");
        Supplier<Integer> sup = () -> 3 * 3;
        Consumer<Integer> con = num -> System.out.println(num);
        Function<Integer, String> fun = num -> "input: " + num;
        Predicate<Integer> pre = num -> num > 10;
        UnaryOperator<Integer> u0p = num -> num * num;

    }
}
