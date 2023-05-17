import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File {
    public static List<String> fileLineRead(String path) throws IOException {
        List<String> file = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            file.add(s);
        }
        bufferedReader.close();
        return file;
    }
}
