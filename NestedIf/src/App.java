public class App {
    public static void main(String[] args){

        int num1 = 2;
        int num2 = 10;
        int num3 = 20;
        int greatestNumber;

        if(num1>num2) {
            if(num1>=num3){
                greatestNumber = num1;
            }
            else {
                greatestNumber = num3;
            }
        }
        else {
            if(num2>=num3){
                greatestNumber = num2;
            }
            else {
                greatestNumber = num3;
            }

            System.out.println("The largest number is: "+greatestNumber);

        }    }
}
