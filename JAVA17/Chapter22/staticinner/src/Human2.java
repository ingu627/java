public class Human2 {
    int field;
    static int staticField;
    
    // 내부 클래스는 외부의 모든 멤버를 액세스할 수 있다.
    class Name {
        void method() {
            field = 0;
            staticField = 0;
        }
    }
    
    // static 내부 클래스는 외부의 static 필드만 액세스할 수 있다.
    static class StaticName {
        void method() {
            // field = 0;
            staticField = 0;
        }
    }
    
    // non static 메소드는 내부, static 내부 클래스 모두 액세스할 수 있다.
    void method() {
        Name n = new Name();
        StaticName sn = new StaticName();
    }
    
    // static 메소드는 static 내부 클래스만 액세스할 수 있다.
    static void staticmethod() {
        // Name n = new Name();
        StaticName sn = new StaticName();
    }


}
