import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:/java/file.txt"));
//
//        bufferedWriter.write("This is the first line!");
//        bufferedWriter.write(System.lineSeparator());
//        bufferedWriter.write("This is the second line!");
//
//        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("F:/java/file.txt"));

        String line = bufferedReader.readLine();

        while(line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();

        }

        bufferedReader.close();

    }
}
