import java.util.Scanner;

public class GPAconverter {
    public static void main(String[] args){
        System.out.println("How many course you had this semester");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        double[] nbcourses = new double[x];
        double sum = 0;

        for (int i=0;i< nbcourses.length;i++) {
            System.out.println("Enter your average for the course" + (i+1)+ ":");
            nbcourses[i] = scan.nextDouble();

        }
        for (int i=0; i<nbcourses.length;i++){
            sum = sum + nbcourses[i];
        }

        double average = sum/nbcourses.length;

        if (average>90) {
            System.out.println("you have A");
        } else if (90>= average && average>80) {
            System.out.println("You have B");
        } else if (80>= average && average>70) {
            System.out.println("You have C");
        } else if (70>= average && average>60) {
            System.out.println("You have D");
        } else if (average < 60){
            System.out.println("You have failed");
        } else {
            System.out.println("Please try again");
        }




    }
}
