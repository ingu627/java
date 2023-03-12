## 4. 자바가 확장한 객체 지향 

### abstract 키워드 - 추상 메서드와 추상 클래스

- **추상(abstract)** 메서드는 선언부는 있는데 구현부가 없는 메서드를 말한다.
- 예를 들어 상위클래스인 동물은 우는 소리가 없어야 한다. 즉, 메서드 선언은 있으되 몸체는 없는 형태로 메서드를 구현하는 것이다.
- 추상 클래스는 인스턴스, 즉 객체를 만들 수 없는 클래스가 된다.
  - 그럼 동물 객체를 안 만들어도 되고, 동물의 우는 메서드를 안 만들어도 된다. 
    - 추상 메서드와 추상 클래스로 위 문제를 모두 해결할 수 있다.

<br>

- **summary**
  1. 추상 클래스는 인스턴스, 즉 객체를 만들 수 없다. 즉, new를 사용할 수 없다.
  2. 추상 메서드는 하위 클래스에게 메서드의 구현을 강제한다. 오바리이딩 강제
  3. 추상 메서드를 포함하는 클래스는 반드시 추상 클래스여야 한다.

<br>

### 생성자

- 클래스의 인스턴스, 즉 객체를 만들 때마다 new 키워드를 사용한다.
  - `()`는 메서드를 의미하는데, **클래스명()**도 메서드이다.
  - 반환값이 없고 클래스명과 같은 이름을 가진 메서드를 객체를 생성하는 메서드라고 해서 객체 생성자 메서드라고 한다.
    - 줄여서 **생성자**라고 한다.

```java
public class 동물 {
    public 동물() {} // 자바가 개발자의 수고를 덜어주고자 자동으로 기본 생성자를 만들어 준다.
}
```

<br>

### 클래스 생성 시의 실행 블록, static 블록 

- **static** 블록은 클래스가 스태틱 영역에 배치될 때 실행되는 코드 블록
- static 블록에서 사용할 수 있는 속성과 메서드는 당연히 static 멤버 뿐이다. 
  - 객체 멤버는 클래스가 static 영역에 자리 잡은 후에 객체 생성자를 통해 힙에 생성된다.
- 스태틱 영역도 메모리이다. 자바에서 스태틱 영역에 한번 올라가면 프로그램이 종료되기 전까지는 해당 메모리를 반환할 수 없지만 그럼에도 최대한 늦게 로딩함으로써 메모리 사용을 최대한 늦춘다.

<br>

- **summary**
  1. 클래스 정보는 해당 클래스가 코드에서 맨 처음 사용될 때 T 메모리의 스태틱 영역에 로딩되며, 이때 단 한번 해당 클래스의 static 블록이 실행된다.

<br>

### final 키워드

- **final** 키워드가 나타날 수 있는 곳은 클래스, 변수, 메서드 뿐이다.
  - 클래스에 final이 붙으면 상속을 허락하지 않겠다는 의미다.
  - 변수에 final이 붙었다면 변경 불가능한 상수임을 선언한다는 의미다.
  - 메서드에 final이 붙으면 재정의, 즉 오버라이딩을 금지하게 된다.

<br>

### instanceof 연산자 

- 인스턴스는 클래스를 통해 만들어진 객체이다.
- **instanceof** 연산자는 만들어진 객체가 특정 클래스의 인스턴스인지 물어보는 연산자다.
  - 따라서 true 또는 false로 결과를 반환한다.
- instanceof 연산자는 클래스들의 상속 관계뿐만 아니라 인터페이스의 구현 관계에서도 동일하게 적용된다.

```java
객체_참조_변수 instanceof 클래스명
```

<br>

### package 키워드

- **package** 키워드는 네임스페이스(이름공간)를 만들어주는 역할을 한다.

<br>

### interface 키워드와 implements 키워드

- 인터페이스는 public 추상(abstract) 메서드와 public 정적(static) 상수만 가질 수 있다.
  - 따라서 메서드에 public과 abstract, 속성에 public과 static, final을 붙이지 않아도 자동으로 자바가 알아서 붙여준다.

<br>

### this 키워드

- **this**는 객체가 자기 자신을 지칭할 때 쓰는 키워드다.
- 지역 변수와 속성(객체 변수, 정적 변수)의 이름이 같은 경우 지역 변수가 우선한다.
- 객체 변수와 이름이 같은 지역 변수가 있는 경우 객체 변수를 사용하려면 this를 접두사로 사용한다.
- 정적 변수와 이름이 같은 지역 변수가 있는 경우 정적 변수를 사용하려면 클래스명을 접두사로 사용한다.

<br>

### super 키워드 

- **super**는 바로 위 상위 클래스의 인스턴스를 지칭하는 키워드다.