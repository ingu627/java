public class Human {
    int age;
    Name name;

    class Name {
        String first;
        String family;

        Name(String first, String family) {
            this.first = first;
            this.family = family;
        }

        void outName() {
            Util.outName(this);
        }

        void outWho() {
            Util.outHuman(Human.this);
        }
    }

    Human(int age, String first, String family) {
        this.age = age;
        this.name = new Name(first, family);
    }

    void intro() {
        System.out.println("안녕." + age + "살" + name.family + name.first + "입니다.");
    }
}
