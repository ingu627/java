import java.io.IOException;

public class ChildClass extends ParentClass {

    @Override
    public void method() throws ClassNotFoundException {
        // 만약 ParentClass에서 Exception을 throw을 안 했다면,
        // child에서 IOException은 에러가 발생
        // ArrayIndexOutOfBoundsException -> unchecked exception
        // NullPointerException -> unchecked exception
        // IOException -> checked exception
        // ClassNotFoundExceptoin -> checked exception
        System.out.println("This is the child class...");
    }
}
