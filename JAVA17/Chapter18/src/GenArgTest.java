import java.util.ArrayList;

public class GenArgTest {
    static <T> void dumpArray(ArrayList<T> ar) {
        for(T a : ar) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> yoil = new ArrayList<>();
        yoil.add("일요일");
        yoil.add("월요일");
        GenArgTest.dumpArray(yoil);

        ArrayList<Integer> score = new ArrayList<>();
        score.add(98);
        score.add(72);
        GenArgTest.dumpArray(score);
    }
}
