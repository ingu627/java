// 5명의 학생의 수학 점수를 입력받아서 평균과 최고점을 구하는 프로그램
import java.util.Scanner;

public class 정현석 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SIZE = 5; // 배열의 크기
        final int MIN = 0; // 점수의 최소값
        final int MAX = 100; // 점수의 최대값

        SIZE = 3;

        int[] scores = new int[SIZE];

        int sum = 0;
        int max = 0;

        // for 반복문을 사용하여 SIZE번 반복하면서 점수를 입력받고 배열에 저장하기
        for (int i = 0; i <= scores.length; i++) {
            System.out.print((i + 1) + "번째 학생의 실습 점수: ");
            scores[i] = sc.nextInt();

            // 입력받은 점수가 유효한 범위인지 검사하는 조건문 작성 (단, MIN, MAX 활용해야됨)
            /*
               주석 지우고 코드 작성
             */

            sum += scores[i]; // sum에 점수 더하기

            // 삼항 연산자를 사용하여 max와 점수 중 큰 값을 max에 저장하기
            /*
               주석 지우고 코드 작성
             */
        }

        sc.close(); // Scanner 객체 닫기

        // 평균값 계산하기
        double avg = sum / scores.length;

        System.out.println("평균: " + avg); // 평균 출력하기
        System.out.println("최고점: " + max); // 최고점 출력하기

    }
}