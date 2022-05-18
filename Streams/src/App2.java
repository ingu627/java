import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class App2 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kevin");
        map.put(2, "Joe");
        map.put(3, "Adam");
        map.put(4, "Judy");
        map.put(5, "Donald");

        Map<Integer, String> resultMap = map.entrySet().stream().filter(m->m.getKey()<=4).skip(2).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(resultMap);

    }
}
