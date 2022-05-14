public class App1 {
    public static void main(String[] args){
        Sum1 sum1 = (num1, num2) -> add(num1, num2);
        System.out.println(sum1.addition(10,11));

        Sum1 sum2 = App1::add;
        System.out.println(sum2.addition(5, 10));

        // This is the main advantage of lambdas (we can chain operations)

        Sum1 sum3 = (num1, num2) -> add(num1, increment(num2));
        System.out.println(sum3.addition(10, 15));

        // We are not able to do the same with method references !!!
//        ex. App::add(num1, num2)::increment;

    }

    private static int add(int num1, int num2) {
        return num1+num2;
    }

    private static int increment(int num) {
        num += 10;
        return num;
    }
}
