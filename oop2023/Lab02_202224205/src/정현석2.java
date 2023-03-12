// numStudents 명의 학생의 실습 점수를 입력받아서 평균과 최댓값을 구하는 프로그램
import java.util.Scanner;

public class 정현석2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MIN_SCORE = 0; // 실습 점수의 최소값
        final int MAX_SCORE = 100; // 실습 점수의 최대값
        int numStudents;
        int sum = 0;
        int maxScore = 0;

        do {
            System.out.println("학생 습수를 입력하세요: ");
            numStudents = sc.nextInt();
        } while (numStudents <= 0); // 학생 수가 0 이하이면 다시 입력받도록 처리함

        // for 반복문을 사용하여 numStudents번 반복하면서 실습 점수를 입력받고 배열에 저장하기
        for (int i = 0; i <= numStudents; i++) {
            System.out.print((i+1) + "번째 학생의 실습 점수: ");
            int score = sc.nextInt();

            // 입력받은 실습 점수가 유효한 범위인지 검사하는 조건문 작성 (단, MIN_SCORE, MAX_SCORE 활용해야됨)
            /*
               주석 지우고 코드 작성
             */

            sum += score; // sum에 점수 더하기

            // 입력받은 실습 점수 중 최댓값(maxScore) 구하는 코드 작성하기
            /*
               주석 지우고 코드 작성
             */
        }

        sc.close(); // Scanner 객체 닫기

        // 평균값 계산하기
        double avg = sum / numStudents;

        System.out.printf("평균: %.2f \n" + avg); // 평균 출력하기
        System.out.println("최고점: " + maxScore); // 최고점 출력하기

    }
}