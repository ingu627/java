public class Start4 {
    public static void main(String[] args) {
        int k = 5;
        int m;

        m = square(k); // square 메서드에 return 값이 있으니 그 값을 돌려주면서 스택에서 사라진다.

        System.out.println(m);
    }

    private static int square(int k) {
        int result;
        k = 25;

        result = k;

        return result;
    }
}
