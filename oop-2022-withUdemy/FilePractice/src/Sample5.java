import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample5 {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("f:/java/Test.txt");
        for(int i=1; i<11;i++) {
            String data = i+" 번째 줄입니다.zd";
            printWriter.println(data);
        }
        printWriter.close();
    }
}
