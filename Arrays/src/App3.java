public class App3 {
    public static void main(String[] args) {

        sum("Adam", 10,3, 5, 10, 200);

    }

    public static void sum(String name, int age, int ... nums) {

        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }

        System.out.println("Result is: "+sum);

    }
}
