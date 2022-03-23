public class Overloading {

        /*
        Method Overloading

        If a class has multiple methods having same name but different aprameters, it is known as Method
        Overloading. There are two ways to overload the mothod in java:
        1. changing number of arguments
        2. changing the data type
         */
        public static void main(String[] args){
            System.out.println(add(1.0,2.0));
    }

    static int add(int num1, int num2) {
            System.out.println("Adding two integers...");
            return num1+num2;
    }

    static int add(int num1, int num2, int num3) {
        System.out.println("Adding 3 integers...");
        return num1+num2+num3;
    }

    static double add(double num1, double num2) {
        System.out.println("Adding two integers...");
        return num1+num2;
    }

}
