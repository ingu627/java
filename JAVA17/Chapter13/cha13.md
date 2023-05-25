## 인터페이스

## 1. 추상 클래스 

- 실제 모델링할 때는 자식 클래스의 집합을 먼저 만들고 공통된 속성을 추출하여 부모를 정의하는 것이 더 쉽다. 
  - 사람의 사고는 특수한 것으로부터 일반성을 추출하는 것에 더 익숙하기 때문이다.
- **추상화(abstract)**는 사물의 공통 속성을 뽑아 클래스 계층을 만드는 과정을 말한다.
- 공동의 조상을 만듦으로써 계층을 형성해 다형성의 이점을 누릴 수 있다.

<br>

### 1.1 추상 메소드

- 메소드가 너무 일반적이어서 동작을 정의할 수 없는 메소드를 **추상 메소드**라고 한다. 
  - **추상적**이라는 것은 미완성이나 불완전하다는 뜻이다. 
- 추상 메소드로 선언하면 자식에게 구현을 강제하는 효과가 있다. 

<br>

### 1.2 추상 클래스 

- 추상 메소드가 하나라도 있으면 클래스는 반드시 추상이어야 한다.
- 추상 클래스라고 해서 추상 메소드로만 구성되는 것은 아니며 일반 메소드나 필드도 가질 수 있다. 

<br>

## 2. 인터페이스

- 인터페이스는 모든 메소드가 추상이며 구현 코드는 가지지 않는다.
- 즉, 인터페이스는 추상 클래스보다 정도가 더 높은 완전 추상 클래스라고 할 수 있다.
- 인터페이스는 클래스와 같은 레벨이므로 첫 자를 대문자로 쓴다. 
- 인터페이스의 메소드는 항상 public abstract일 수밖에 없기 때문에 생략해도 괜찮다. 
- 하지만, 인터페이스에서 상수는 가질 수 있다. 상수이므로 대문자로 쓰이며 초기화해야 한다.
  - `public static final`이 생략되어 있다. 
- 인터페이스의 메소드를 구현할 때는 반드시 public 지정자를 붙인다. 

<br>

### 2.1 인터페이스 상속

- 인터페이스도 클래스와 마찬가지로 상속 계층을 구성하되 인터페이스끼리만 상속받으며 클래스로부터 상속받을 수는 없다.

<br>

## 3. 인터페이스 확장 

- 자바 8에서부터 인터페이스에 메소드를 추가할 수 있는 다음 두 가지 장치를 도입했다.

1. **디폴트 메소드** : 인터페이스에 기본 구현 코드를 작성한다.
2. **static 메소드** : 인터페이스로부터 호출 가능한 공통의 코드를 작성한다.

- 위 두 기능을 사용하면 인터페이스가 구현 코드를 가져 서브 클래스에서 굳이 재정의하지 않아도 된다.

<br>

### 3.1 디폴트 메소드

- **디폴트 메소드**는 본체를 가지고 구현을 정의하는 인터페이스 소속의 메소드이다. 
- 일반 클래스와 메소드를 작성하는 방법과 같되 선언문에 default 지정자를 붙여 본체가 있음을 밝힌다.
- **default** 키워드가 있으면 인터페이스의 메소드도 추상이 아니며 본체를 가진다.
- 인터페이스는 원래 추상 메소드의 목록만 제공하여 자식 클래스가 구현해야 할 의무 사항을 강제하는 문법적 장치였다.
  - 구체적으로 구현을 가지지 않음으로써 다중 상속의 문제를 회피하고 자식에게 구현의 자유를 부여하였으나 자바 8부터 디폴트 메소드를 도입하여 구현을 가질 수 있도록 바뀌었다.

<br>

### 3.2 static 메소드

- **static 메소드**는 객체 소속이 아니며 인터페이스에 소속되어 모든 객체가 공유하는 유틸리티 메소드이다.
- 구현이 있더라도 소속만 인터페이스일 뿐 자식 클래스가 구현할 의무는 없다.

<br>

### 3.3 다중 구현 상속

- 자바 8에서부터 인터페이스가 구현을 가지게 됨으로써 클래스와 인터페이스 사이의 경계가 애매해졌다.
- 현재의 인터페이스는 추상 클래스와 비슷해서 추상 메소드와 구체 메소드를 모두 가질 수 있다.
- 그러나 클래스는 필드를 가질 수 있지만, 인터페이스는 오로지 메소드로만 구성되어 정적 상수 필드만 가질 수 있다.
- 그리고, 인터페이스는 클래스와는 달리 다중 상속이 가능하다.
- 자바는 또한 다음과 같은 우선순위 규칙을 마련했다.
  1. 클래스와 인터페이스가 같은 메소드를 정의하면 클래스가 우선이다.
  2. 인터페이스끼리 같은 메소드를 정의하면 가까운 조상이 우선이다.