import java.io.*;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        System.out.println("텍스트 파일들을 읽으시겠습니까?");
        Scanner scan1 = new Scanner(System.in);
        String yes = scan1.next();

        if (yes.equals("yes")) {

            BufferedReader br1 = new BufferedReader(new FileReader("F:/java/FirstNum.txt"));

            String line = br1.readLine();

            System.out.println("첫번째 파일");

            while (line != null) {
                System.out.println(line);
                line = br1.readLine();

            }

            br1.close();

            BufferedReader br2 = new BufferedReader(new FileReader("F:/java/SecondNum.txt"));

            System.out.println("\n두번째 파일");

            String line2 = br2.readLine();

            while (line2 != null) {
                System.out.println(line2);
                line2 = br2.readLine();

            }

            br2.close();

        } else {
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
        }

        System.out.println("\n 각 요소들을 곱하여 더한 값을 새로운 텍스트 파일로 쓰시겠습니까?");
        Scanner scan2 = new Scanner(System.in);
        String yes2 = scan2.next();

        if (yes2.equals("yes")) {

            List<String> m1 = File.fileLineRead("F:/java/FirstNum.txt");
            List<String> m2 = File.fileLineRead("F:/java/SecondNum.txt");

            int mul = 0;


            for (int i = 0; i < 3; i++) {
                String[] str = m1.get(i).split(",");
                String[] str2 = m1.get(i).split(",");
                for (int j = 0; j < 3; j++) {
                    int n = Integer.parseInt(str[j]);
                    int n2 = Integer.parseInt(str2[j]);
                    mul += n*n2;
                }
            }

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:/java/file.txt"));

            bufferedWriter.write("20202020 홍길동\n");
            bufferedWriter.write(System.lineSeparator());
            bufferedWriter.write("첫번째 파일과 두번째 파일의 각 요소들을 모두 곱하여 더한 결과는 "+mul + "입니다.");

            bufferedWriter.close();

            System.out.println("파일 쓰기가 완료되었습니다. 감사합니다.");

        } else {
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
        }






    }
}