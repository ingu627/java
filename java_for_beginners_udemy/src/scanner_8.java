import java.util.Scanner; // 읽은 바이트를 해당 타입으로 변환하여 리턴하는 클래스

public class scanner_8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();

        System.out.println(txt);
    }
}
