public class App2 {
    public static void main(String[] args){

//        int[][] nums = new int[3][4];
        int[][] nums = {{1,2,3, 3},{4,5},{7,8,9}};

//        for(int i=0;i<3;i++)
//            for(int j=0;j<4;j++)
//                nums[i][j] = i+j;

        // random access (it has O(1) running time coplexity)
//        nums[2][2] = 8;

//        for(int i=0;i<3;i++) {
//            for(int j=0;j<3;j++) {
//                System.out.print(nums[i][j]+" ");
//            }
//            System.out.println();

//        nums[1][2] = 8; // error

        for(int[] array:nums){
            for(int num : array) {
                System.out.print(num+" ");
            }
            System.out.println();
        }

        }

    }
