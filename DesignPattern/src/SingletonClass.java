public class SingletonClass {

    // early or eager instantiation
//    private static volatile SingletonClass singletonClass = new SingletonClass();
    private static volatile SingletonClass singletonClass = null;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if(singletonClass==null) {

            synchronized (SingletonClass.class) {
                if(singletonClass==null) {
                    singletonClass = new SingletonClass();
                }
            }

        }
        return singletonClass;
    }

    public void show() {
        System.out.println("This is the show() method of the SingletonClass...");
    }

}
