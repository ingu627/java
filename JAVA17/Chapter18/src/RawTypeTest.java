public class RawTypeTest {
    public static void main(String[] args) {
        Box raw = new Box(1234);
        Box<Integer> para = new Box<Integer>(5678);
        raw = para;
        int value = (int) raw.get();
        System.out.println(value);
        // para 객체에 저장 가능한 모든 데이터는 raw 객체에도 저장할 수 있다.
        // 단, raw 객체는 타입 정보가 없어 읽을 때 반드시 캐스팅해야 한다.
    }
}
