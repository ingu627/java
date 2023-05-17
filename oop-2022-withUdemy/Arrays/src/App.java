import java.util.Arrays;

public class App {
    public static void main(String[] args){

        int[] nums = {1,5,3,10,15,0};
        int[] nums2 = {1,5,3,10,15,0};

        int[] copyArray = Arrays.copyOf(nums, nums.length);

        System.out.println(Arrays.toString(copyArray));

//        String[] names = {"Adam", "Kevin", "Joe", "Nora"};

//        Arrays.fill(nums, 10);

        //binary search to find a given x item

//        int result = Arrays.binarySearch(nums, 10);
//        System.out.println(result); // return index
//
//        Arrays.sort(nums);
//
//        System.out.println(Arrays.toString(nums));

//        System.out.println(Arrays.equals(nums, nums2));



    }
}
