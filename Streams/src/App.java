import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Adam", "Kevin", "Joe", "Alan", "Natlie");

//        List<String> filteredNames = names.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
//        filteredNames.forEach(System.out::println);


//        names.stream().filter(name->name.startsWith("A")).forEach(System.out::println);


        Stream<String> stream = names.stream().filter(name->name.startsWith("A"));
        stream.forEach(System.out::println);



    }
}
