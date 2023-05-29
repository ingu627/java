public class BoundTest {
    static class Human {
        void intro() {
            System.out.println("나 사람");
        }
    }

    static class Student extends Human {
        void intro() {
            System.out.println("나 학생");
        }
    }

    static class Box<T extends Human> {
        T value;
        Box(T value) {
            this.value = value;
        }
        T get() {
            return value;
        }
        void set(T value) {
            this.value = value;
        }
        void intro() {
            value.intro();
        }
    }

    public static void main(String[] args) {
        Human h = new Human();
        Box<Human> bh = new Box<Human>(h);
        bh.intro();

        Student s = new Student();
        Box<Human> bs = new Box<Human>(s);
        bs.intro();
    }

}
