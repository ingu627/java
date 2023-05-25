import java.util.ArrayList;
public class RawArrayList {
    public static void main(String[] args) {
        ArrayList arNum = new ArrayList();
        arNum.add(1);
        arNum.add("문자열");
        int value = (int) arNum.get(0);
        // 형변환 안 할 시 에러 남
        System.out.println(value);

    }
}
