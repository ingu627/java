import java.io.*;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String args[]) throws IOException {

        Scanner scan = new Scanner(System.in);

        boolean convertor = true;
        int fileNotFoundException = 0;

        while(convertor) {
            System.out.println("Enter file path : ");
            String path = scan.next();

            try {
                List<String> fashionMnist = File.fileLineRead(path);
                convertor=false;
            }
            catch(FileNotFoundException e1) {
                System.out.println(e1);
                fileNotFoundException +=1;

            }
        }


        List<String> fashionMnist = File.fileLineRead("f:/java/fashion_mnist48.txt");

        int[][] strList = new int[28][28];
        int numberFormatException = 0;
        int arrayIndexOutOfBoundsException = 0;
        double sum=0;


        for(int i=0;i<28;i++){
            String[] str = fashionMnist.get(i).split(",");
            for(int j=0;j<29;j++){

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
                catch(ArrayIndexOutOfBoundsException e3) {
                    arrayIndexOutOfBoundsException +=1;
                }

            }
        }

        double avg=sum/(28*28);

        System.out.println();
        System.out.println("Average : " + avg);
        System.out.println("Total FileNotFoundException : "+fileNotFoundException);
        System.out.println("Total NumberFormatException : "+numberFormatException);
        System.out.println("Total ArrayIndexOutOfBoundsException : " + arrayIndexOutOfBoundsException);

    }

}