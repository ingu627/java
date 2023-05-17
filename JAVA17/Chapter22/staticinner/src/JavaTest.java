public class JavaTest {
    public static void main(String[] args) {
        Human jung = new Human(29, "현석", "정");
        jung.intro();

        Human.Name name = new Human.Name("순신", "이");
        System.out.println("이름: " + name.family + name.first);
    }
}
