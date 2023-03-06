public class App1 {

    public static void main(String[] args) throws InterruptedException{

        // sequential execution: the tasks are executed one after the other

//        Runner1 runner1 = new Runner1();
//        Runner2 runner2 = new Runner2();
//
//        runner1.doOperation();
//        runner2.doOperation();

        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Thread(new Runner2());

        t1.start();
//        t1.join();
        t2.start();

    }
}
