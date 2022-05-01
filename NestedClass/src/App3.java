public class App3 {

    public static void main(String[] args){

//        AbstractClass3 abstractClass3 = new AbstractClass3() {
//            @Override
//            void showMsg() {
//                System.out.println("This is a message...");
//            }
//        };
//
//        abstractClass3.showMsg();

        AbstractInterface3 abstractInterface3 = new AbstractInterface3() {
            @Override
            public void showMsg() {
                System.out.println("Showing the message...");
            }

            @Override
            public void sendMsg() {
                System.out.println("Sending the message...");
            }
        };

        abstractInterface3.showMsg();
        abstractInterface3.sendMsg();
    }
}
