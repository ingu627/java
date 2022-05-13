import java.util.ArrayList;
import java.util.List;

public class App2 {

    public static void main(String[] args) {

        List<Integer> names = new ArrayList<>();
        names.add(10);
        names.add(20);

        print(names);


    }

    public static void print(List<? extends Number> numbers) {

        for(Number value : numbers)
            System.out.println(value);
    }
}
