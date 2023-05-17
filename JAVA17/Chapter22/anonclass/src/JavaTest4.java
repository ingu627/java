// 익명 클래스 사용했을 경우
public class JavaTest4 {
    public static void main(String[] args) {
        Human2 lee = new Human2() {
            public void intro() {
                System.out.println("나는 학생입니다.");
            }
        };
        lee.intro();
    }
}
