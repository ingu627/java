public class JavaTest {
    public static void main(String[] args) {
        Human jung = new Human(29, "현석", "정");
        jung.intro();
        jung.name.outAge();

        Human.Name name = jung.new Name("순신", "이");
        System.out.print(name.family + name.first + ". ");
        name.outAge();
    }
}
