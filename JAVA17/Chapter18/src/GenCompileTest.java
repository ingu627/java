public class GenCompileTest {
    static class Box<T> {
        T value;
        Box(T value) {
            this.value = value;
        }
        T get() {
            return value;
        }
        void set(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Box<Integer> bi = new Box<Integer>(1234);
        Box<Double> bd = new Box<Double>(56.78);
        System.out.println(bi.getClass() == bd.getClass());

    }


}
