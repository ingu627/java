public class JavaTest {
    public static void main(String[] args) {
        class Human {
            int age;
            String name;

            Human(int age, String name) {
                this.age = age;
                this.name = name;
            }

            void intro() {
                System.out.println("안녕." + age + "살" + name + "입니다.");
            }
        }

        Human jung = new Human(29, "현석");
        jung.intro();
    }
}
