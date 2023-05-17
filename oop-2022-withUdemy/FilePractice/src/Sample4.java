import java.io.FileWriter;
import java.io.IOException;

public class Sample4 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("f:/java/Test.txt");
        for(int i=1; i<11;i++) {
            String data = i+" 번째 줄입니다.z\r\n";
            fileWriter.write(data);
        }
        fileWriter.close();
    }
}
