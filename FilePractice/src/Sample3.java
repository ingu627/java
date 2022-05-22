import java.io.FileOutputStream;
import java.io.IOException;

public class Sample3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("f:/java/Test.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fileOutputStream.write(data.getBytes());
        }
        fileOutputStream.close();
    }
}
