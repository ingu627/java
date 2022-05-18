public class App2 {

    /*
    As our data objects grow in size, the constructor may grow to contain many attributes

    Users who reference our object would also be required to update their constructor calls each
    time that the object was modified, resulting in a class that would be difficult to use and maintain

    builer pattern solves this problem; we can use method chaining instead of using many parameters

    -> The primary advantage of the builder pattern is that over time this approach leads to far more maintainable code

    -> if a new optional field is added to the Person class then our code that creates objects using the PersonBuilder Class will not need to be changed
     */

    public static void main(String[] args) {

//        Car car = new Car.CarBuilder().setBrand("Ford").setName("Fiesta").setColor("gray").setNumOfDoors(3).setHorsePower(80).build();
        Car car = new Car.CarBuilder().setBrand("Ford").setName("Fiesta").setHorsePower(80).build();
        System.out.println(car);

    }

}
