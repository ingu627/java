import java.util.stream.IntStream;

public class App3 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        long c = IntStream.rangeClosed(0, 1000000000).parallel().filter(i->i%2==0).count();

        long duration = System.currentTimeMillis()-start;

        System.out.println("Count: "+c+" in "+duration+" ms");
    }
}
