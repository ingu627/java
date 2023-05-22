public class Throw3 {
    public static void main(String[] args) {
        String name = null;
        try {
            printScore(name);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    static void printScore(String name) throws NullPointerException {
        if (name == null) {
            throw new NullPointerException("이름이 무효합니다.");
        }
        System.out.println(name.length());
    }
}
