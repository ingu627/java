public class JavaTest3 {
    public static void main(String[] args) {
        class Anonymous implements Human2 {
            public void intro() {
                System.out.println("나는 학생입니다.");
            }
        }

        Anonymous lee = new Anonymous();
        lee.intro();
    }
}
