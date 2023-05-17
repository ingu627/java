import java.util.Map;
import java.util.HashMap;

public class map_24 {
    public static void main(String[] args){
        Map cars = new HashMap();
        cars.put("BMW",3);
        cars.put("Audi",2);
        cars.put("Mercedez",5);
        cars.put("Honda",7);
        cars.put("Mustang",1);
        cars.remove("BMW");
        int size = cars.size();


        System.out.println(cars.get("Audi"));

    }
}
