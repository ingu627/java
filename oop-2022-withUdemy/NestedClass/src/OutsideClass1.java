public class OutsideClass1 {

    private String message = "Hello world";

    class InnerClass1 {

        public void showMessage() {
            System.out.println(message);
        }

    }
}
