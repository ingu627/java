import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App1 {

    public static void main(String[] args) {

//        Stream.of("item1", "item2", "item3").findFirst().ifPresent(System.out::println);
//        Stream.of(10,20,30).findFirst().ifPresent(System.out::println);
//        List<String> names = Arrays.asList("Alan", "Adam", "Kevin", "Joe", "James");

//        System.out.println(names.stream().filter(name->name.startsWith("J")).count());

//        Stream<Integer> numbers = Stream.iterate(1, n->n+5).limit(10);
//
//        numbers.forEach(n->System.out.print(n+" "));

//        Stream<Double> numbers = Stream.generate(Math::random).limit(5);

//        numbers.forEach(System.out::println);

//        String[] title = {"This", "is", "just", "an", "example"};
//
//        Stream<String> stream = Arrays.stream(title);
//
//        Optional<String> result = stream.reduce((word1, word2)->word1+"-"+word2);
//
//        System.out.println(result.get());


//        List<String> words = Arrays.asList("this", "is", "again", "an", "example");
//
//        words.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);


        List<String> femaleNames = Arrays.asList("Kate", "Judy", "Nicole");
        List<String> maleNames = Arrays.asList("Kevin", "Peter", "Joe");

        List<List<String>> names = Arrays.asList(femaleNames, maleNames);

        System.out.println(names);

        names.stream().flatMap(list->list.stream()).collect(Collectors.toList()).forEach(System.out::println);





    }
}
