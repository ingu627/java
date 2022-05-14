public class Runner2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
            System.out.println("Runner2 with integer value "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

//    public void doOperation() {
//
//        for(int i=0;i<10;i++)
//            System.out.println("Runner2 with integer value "+i);
//    }


}
