public class App {

    public static void main(String[] args) {

//        Thread t1 = new Thread(new ThreadExample());
//        t1.start();

        int numOfThreads = 6;

        for(int i=0;i<numOfThreads;i++) {
//            Thread t = new Thread(new ThreadExample()); // ThreadExample에서 implements Runnable 할때
            Thread t = new ThreadExample();
            t.start();
        }


    }


}
