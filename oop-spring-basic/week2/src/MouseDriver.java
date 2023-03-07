public class MouseDriver {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();

        mickey.name = "미키"; // . : 참조 연산자 => 실제 힙 상의 객체에 접근해 name 프로퍼티에 "미키" 문자열을 할당
        mickey.age = 85;
        mickey.countOfTail = 1;

        mickey.sing();

        mickey = null;

        Mouse jerry = new Mouse();

        jerry.name = "제리";
        jerry.age = 73;
        jerry.countOfTail = 1;

        jerry.sing();


    }
}
