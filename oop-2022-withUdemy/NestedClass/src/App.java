public class App {

    /*
    Local Inner Class

    Local Inner Class is a non-static class that is created inside a class but inside a method.
    Local Inner class is accessing the instance variable member of the Outer class.
     */

    public static void main(String[] args){

        OutsideClass outsideClass = new OutsideClass();
        outsideClass.outerMethod();
    }
}
