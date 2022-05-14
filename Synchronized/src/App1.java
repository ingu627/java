class ShowNumbers {

    public synchronized void printNumbers(int n) {
        System.out.println("Numbers starting with "+n);

//        synchronized (this) {
            for(int i=1;i<=5;i++) {
                System.out.println(i*n);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//        }

    }
}

class Runner1 extends Thread {

    ShowNumbers showNumbers;

    public Runner1(ShowNumbers showNumbers) {
        this.showNumbers = showNumbers;
    }

    @Override
    public void run() {
        showNumbers.printNumbers(1);
    }
}

class Runner2 extends Thread {

    ShowNumbers showNumbers;

    public Runner2(ShowNumbers showNumbers) {
        this.showNumbers = showNumbers;
    }

    @Override
    public void run() {
        showNumbers.printNumbers(10);
    }
}

public class App1 {

    public static void main(String[] args) {

        ShowNumbers showNumbers = new ShowNumbers();

        Thread t1 = new Runner1(showNumbers);
        Thread t2 = new Runner2(showNumbers);

        t1.start();
        t2.start();
    }
}
