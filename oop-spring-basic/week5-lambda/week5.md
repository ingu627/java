## 람다와 인터페이스 스펙 변화

### 람다가 도입된 이유 

- 빅데이터 지원 -> 병렬화 강화 -> 컬렉션 강화 -> 스트림 강화 -> 람다 도입 -> 인터페이스 명세 변경 -> 함수형 인터페이스 도입

<br>

### 람다란?

- **람다**란 코드 블록이다. 코드 블록인 람다를 메서드의 인자나 반환값으로 사용할 수 있다.
  - 코드 블록을 변수처럼 사용할 수 있게 되었다.

```java
(인자 목록) -> { 로직 }
```

```java
public class B005 {
    public static void main(String[] args) {
        MyFunctionalInterface mfi = (int a) -> {
            return a * a;
        };

        int b = mfi.runSomthing(5);

        System.out.println(b);
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    public abstract int runSomthing(int count);
}
```

- 어노테이션(`@FunctionalInterface`)이 붙은 경우 컴파일러는 인터페이스가 함수형 인터페이스의 조건에 맞는지 검사한다. 
  - 즉, 단 하나의 추상 메서드만을 갖고 있는지 확인한다.

<br>

### 자바 8 API에서 제공하는 함수형 인터페이스 

- 이미 개발자들이 많이 쓸 것이라고 예상되는 함수형 인터페이스를 java.util.function 패키지와 여러 패키지에서 제공하고 있다. 

|함수형|추상 메서드|용도|
|---|---|---|
|Runnable|void run()|실행할 수 있는 인터페이스|
|Supplier<T>|T get()|제공할 수 있는 인터페이스|
|Consumer<T>|void accept(T t)|소비할 수 있는 인터페이스|
|Function<T, R>|R apply(T t)|입력을 받아서 출력할 수 있는 인터페이스|
|Predicate<T>|Boolean test(T t)|입력을 받아 참/거짓을 단정할 수 있는 인터페이스|
|UnaryOperator<T>|T apply(T t)|단항(Unary) 연산할 수 있는 인터페이스|