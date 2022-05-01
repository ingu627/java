public class App2 {
    public static void main(String[] args){

        OuterLoop: for(int i=1; i<=3; ++i){
            System.out.println("Outer loop iteration " + i);

            InterLoop: for(int j=1;j<=2;++j){
                System.out.println("i = " + i + "; j = "+ j);
                if(j==2 && i==2){
                    break OuterLoop;
                }
            }
        }
    }
}
