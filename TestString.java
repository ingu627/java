/**
 * TestString
 */
public class TestString {

    public static void main(String[] args) {
        String a = "Hello Java";
        System.out.println(a); //Hello Java
        System.out.println(a.indexOf("Java")); //6
        System.out.println(a.replaceAll("Java", "World")); //Hello World
        System.out.println(a.substring(0,4)); //Hell
        System.out.println(a.toUpperCase()); //HELLO JAVA
    }
}