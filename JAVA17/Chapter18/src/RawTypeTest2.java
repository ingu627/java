public class RawTypeTest2 {
    public static void main(String[] args) {
        Box raw = new Box(1234);
        Box<Integer> para = new Box<Integer>(5678);
        para = raw;
        int value = para.get();
        System.out.println(value);
    }
}
