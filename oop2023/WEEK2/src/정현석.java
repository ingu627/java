import java.util.Scanner;

public class 정현석 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MIN_SCORE = 0; // 실습 점수의 최소값
        final int MAX_SCORE = 100; // 실습 점수의 최대값
        int numStudents;

        do {
            System.out.print("학생 수를 입력하세요: ");
            numStudents = sc.nextInt();
        } while (numStudents <= 0); // 학생 수가 0 이하이면 다시 입력받도록 처리합니다.

        int sum = 0;
        int maxScore = 0;

        // for 반복문을 사용하여 학생 수만큼 반복하면서 점수를 입력받기
        for (int i = 0; i < numStudents; i++) {
            System.out.print((i+1) + "번째 학생의 실습 점수: ");
            int score = sc.nextInt();

            // 입력받은 점수가 유효한 범위인지 검사하는 조건문 작성 (단, MIN_SCORE, MAX_SCORE 활용해야됨)
            if (score < MIN_SCORE || score > MAX_SCORE) {
                System.out.println("잘못된 점수입니다. 다시 입력하세요.");
                i--; // 유효하지 않은 입력을 받았으므로 i를 감소시켜 다시 입력받을 수 있도록 합니다.
                continue;
            }

            sum += score; // 입력받은 실습 점수를 sum에 더합니다.

            maxScore = (maxScore > score) ? maxScore : score;


        }

        sc.close(); // Scanner 객체 닫기

        // 평균값 계산하기 (sum / 학생 수)
        double avg = (double) sum / numStudents;

        System.out.printf("평균: %.2f \n", avg); // 평균 출력하기
        System.out.println("최고점: " + maxScore); // 최고점 출력하기


    }
}
