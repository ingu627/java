public class App {
public static void main(String[] args){
    Parent p1 = new Parent();
    Parent p2 = new Child();
    Parent p3 = new GrandChild();

    p1.travel();
    p2.travel();
    p3.travel();

    // In Java, we can override methods only, not the variables(data members), so runtime polymorphism cannot be
    //    achieved by data members
    System.out.println(p1.age);
    System.out.println(p2.age);
    System.out.println(p3.age);

    GrandChild g = new GrandChild();
    System.out.println(g.age);
}
}
