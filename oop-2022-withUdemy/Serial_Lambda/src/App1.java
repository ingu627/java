public class App1 {

    public static void main(String[] args) {

        // 기존 방법
//        Sum sum = new Sum() {
//            @Override
//            public int add(int num1, int num2) {
//                return num1+num2;
//            }
//        };
//
//        System.out.println(sum.add(10, 5));

//        Sum sum = (int num1, int num2) -> {return num1+num2;};

//        Sum sum = (num1, num2) -> num1+num2;
//
//        System.out.println(sum.add(10, 20));

        Greetings greetings = msg -> System.out.println("Hello world "+msg);

        greetings.sayHello("useful lambda expression");

    }
}
