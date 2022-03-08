import java.util.Scanner;

public class car_select_14 {
    public static void main(String[] args) {
        System.out.println("Do you want a car yes or no?");
        Scanner scan = new Scanner(System.in);
        String Ans1 = scan.next();

        if (Ans1.equals("yes")) {
            System.out.println("What is your favorite color between red-blue-yellow?");
            String Ans2 = scan.next();

            if (Ans2.equals("red")) {
                System.out.println("We have it in stock would you like to see it yes or No");
                String Ans3 = scan.next();
                if (Ans3.equals("yes")) {
                    System.out.println("Great ! Let's check the car");
                }
                else {
                    System.out.println("No worries we will check something else");
                }
            }
            else if (Ans2.equals("blue")) {
                System.out.println("We can order it");
            }
            else {
                System.out.println("We don't have it in stock");
            }
        }
        else {
            System.out.println("No worries have a good day");
        }
    }
}
