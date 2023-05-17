import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App_imsi {
    public static List<String> fileLineRead(String path) throws IOException {
        List<String> file = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader(path));
        String s;
        while ((s = in.readLine()) != null) {
            file.add(s);
        }
        in.close();
        return file;
    }

    public static void main(String args[]) throws IOException {
        List<String> fashionMnist = fileLineRead("f:/java/fashion_mnist48.txt");
//        for(int i = 0;i<ret.size();i++){
//            System.out.println("Line("+i+")"+ret.get(i));
//        }
//        System.out.println();

//        System.out.println(fashionMnist.get(2));

        int[][] strList = new int[28][28];
        int numberFormatException = 0;
        double sum=0;


        for(int i=0;i<28;i++){
            String[] str = fashionMnist.get(i).split(",");
            for(int j=0;j<28;j++){

                try {
                    int n = Integer.parseInt(str[j]);
                    strList[i][j] = n;
                    sum += strList[i][j];
                }

                catch(NumberFormatException e2) {
                    System.out.println(e2);

                    strList[i][j] = 3000;
                    sum += strList[i][j];
                    numberFormatException += 1;

                }
            }
        }

        double avg=sum/(28*28);

        System.out.println("Average : " + avg);
        System.out.println("Total NumberFormatException : "+numberFormatException);


    }

}