public class App {

    /*

    OOP concepts : inheritance, polymorphism, abstraction, encapsulation

        - wrapping the data / variables / methods into a single unit (object)
        - these will be hidden from other classes
                ~ OK< they can be accessed by methods

                    "DATA HIDING"

     */

    public static void main(String[] args) {

        Student s = new Student();
        s.setAge(25);
        s.setName("Kevin");
        s.setUniversity("MIT");

        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println(s.getUniversity());

    }
}
