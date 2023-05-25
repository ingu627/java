public class GenBoxTest {
    public static void main(String[] args) {
        Box<Integer> bi = new Box<Integer>(1234);
        Box<Double> bd = new Box<Double>(56.78);
        System.out.println(bi.getClass() == bd.getClass());
    }
}
