public class JavaTest {
    public static void main(String[] args) {
        HandPhoneCamera myphone = new HandPhoneCamera();
        // HandPhone의 기능을 확장하면서 Camera의 기능을 구현하였다.
        myphone.call();
        myphone.takePicture();
    }
}
