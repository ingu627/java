public class Start3 {
    public static void main(String[] args) {
        int i = 10;
        int k = 20;

        if(i==10) {
            int m = k + 5;
            k = m;
        } else {
            int p = k + 10;
            k = p;
        } // } 를 만나면 if 블록 스택 프레임은 스택 영역에서 사라진다.
        // 이때 if 블록 스택 프레임 안에 상주하던 변수의 저장 공간도 함께 사라진다.
        // 이를 지역 변수라고 한다. 그 지역에서만 사용할 수 있고 외부에서는 사용할 수 없다.

        System.out.println(k); //
    }
}
