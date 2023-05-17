public class JavaTest {
    public static void main(String[] args) {
        Human lee = new Human() {
            void intro() {
                System.out.println("나는 학생입니다.");
            }
        };
        lee.intro();
    }
}
