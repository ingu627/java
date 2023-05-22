public class MultiCatch {
    public static void main(String[] args) {
        int a,b,c;
        a=5;
        b=2;
        int[] array = {1,2,3,4,5};

        try {
            c=a/b;
            System.out.println("c = "+c);
            array[5] = 100;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("첨자가 배열 범위를 넘어섰습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }
}
