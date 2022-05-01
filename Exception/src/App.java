import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try
        {
            System.out.println("Give me a number: ");
            int n = Integer.parseInt(scan.nextLine());
            System.out.println(20/n);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Arithmetic " + ex);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Number Format Exception " + ex);
        }

        scan.close();
        System.out.println("more code...");
    }
}
