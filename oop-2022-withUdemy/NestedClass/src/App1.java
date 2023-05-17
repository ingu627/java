public class App1 {

    /*
    Member Inner Class

    Member Inner Class created within class and outside method.
    Member Inner Class is accessing the instance variable member of the Outer class.
     */

    public static void main(String[] args){

        OutsideClass1 outsideClass1 = new OutsideClass1();
        OutsideClass1.InnerClass1 innerClass1 = outsideClass1.new InnerClass1();

        innerClass1.showMessage();
    }
}
