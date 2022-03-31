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
        s.setAge(20);
        s.setName("poeun");
        s.setUniversity("LaLa Univ");

        System.out.println(s.getAge()); //20
        System.out.println(s.getName()); //poeun
        System.out.println(s.getUniversity()); //LaLa Univ

    }
}
