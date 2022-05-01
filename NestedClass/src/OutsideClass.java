public class OutsideClass {

    private String message = "This is a message instance variable ...";

    public void outerMethod() {

        class InnerClass {

            public void showMessage() {
                System.out.println(message);
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.showMessage();
    }
}
