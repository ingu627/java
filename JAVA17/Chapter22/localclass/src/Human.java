import java.util.Formatter;

public class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void intro() {
        final String nameCaption = "이름";
        final String ageCaption = "나이";

        class Formatter {
            void outInfo() {
                System.out.println(nameCaption + " : " + name);
                System.out.println(ageCaption + " : " + age);
            }
        }

        Formatter format = new Formatter();
        format.outInfo();
    }


}
