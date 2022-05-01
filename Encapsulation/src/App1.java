import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args){

        List<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Mercedes");

        Cars carsClass = new Cars();
        carsClass.setCars(cars);

        for(String s: carsClass.getCars())
            System.out.println(s);

        // lists and arraylists are mutable objects
        // String
        List<String> actualCars = carsClass.getCars();
        actualCars.add("BMW");

        System.out.println();

        for(String s: carsClass.getCars())
            System.out.println(s);
    }
}
