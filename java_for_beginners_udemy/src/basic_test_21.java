import java.util.Scanner;

public class basic_test_21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the test");
        System.out.println("Question 1: what is 2+2 in letters");
        String ans1 = scan.next();

        while (!ans1.equals("four")) {
            System.out.println("You had the wrong answer try again what is 2+2 in letters: ");
            ans1 = scan.next();
        }
            System.out.println("Great you had the right answer");
            System.out.println("Question 2: Where is toronto ?");

            String ans2 = scan.next();

        while (!ans2.equals("Canada")) {
            System.out.println("You had the wrong answer please try again: ");
            ans2 = scan.next();
        }
        System.out.println("Great you passed the test");
    }
}
