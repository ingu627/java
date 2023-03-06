public class ThreadExample extends Thread {


    @Override
    public void run() {
        System.out.println("Thread number "+Thread.currentThread().getId()+" is running ...");
    }
}
