public class App {
    /*
    Inheritance -> when a given class acquires the properties
    of another class
    ex. methods and variables ...

    Class that inherits: subclass / derived class / child class
    Class whose properties are inherited: superclass / parent class

    super keyword -> with this keyword we can call the parent class
    For example: same method name in both classes we can differentiate the members with super

    Inheritance means is-a relationship
     */

    public static void main(String[] args){

        Student s = new Student(20, "poeun", "LaLa univ");
        s.showStudent();
        /*
        Student name: poeun
        Age: 20
        University: LaLa univ
         */
        s.showAge(); //Age is 20


    }
}