public class ZooKeeper {
    public void feed(Tiger tiger) {
        System.out.println("feed apple");
    }
    public void feed(Lion lion) {
        System.out.println("feed banana");
    }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger); //feed apple
        zooKeeper.feed(lion); //feed banana
    }
}
