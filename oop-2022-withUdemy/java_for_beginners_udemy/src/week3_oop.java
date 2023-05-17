import java.util.Scanner;

public class week3_oop {
    public static void main(String[] args) {
        String[] coffeeList = {"americano", "cafeLatte", "espresso"};
        int[] price = {1100, 1800, 1200};
        String bar = "-";

        System.out.println(bar.repeat(14));
        for (int i=0; i<coffeeList.length; i++) {
            System.out.println(coffeeList[i]+ ": " + price[i]);

        }
        System.out.println(bar.repeat(14));

        Scanner scan1 = new Scanner(System.in);

        System.out.println("please input your money");
        int inputMoney = scan1.nextInt();

        boolean converter = true;
        while (converter) {
            System.out.println("Choose the drink you want");
            Scanner scan2 = new Scanner(System.in);
            String drink = scan2.next();

            for (int i = 0; i < coffeeList.length; i++) {
                if (drink.equals(coffeeList[i])) {
                    inputMoney = inputMoney - price[i];
                }
            }


            System.out.printf("you choose %s. The remaining amount is %d won.", drink, inputMoney);
            System.out.println();
            System.out.println("Do you want more drink? yes or no");
            Scanner scan3 = new Scanner(System.in);
            String answer = scan3.next();

            if (answer.equals("yes") && inputMoney < 1000) {
                System.out.println("No! you don't have money.");
                converter = false;
            }

            else if (answer.equals("no") || inputMoney < 1000) {
                converter = false;
            }
        }
        System.out.printf("The change is %d.", inputMoney);
        System.out.println();
        System.out.println("Thank you for using it! Have a nice day~");

    }
}
