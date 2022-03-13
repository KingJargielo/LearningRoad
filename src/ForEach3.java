public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int nums [][][] = new int[10][10][10];

        for (int x = 0; x < nums.length; x++) {
            for (int y = 0; y < nums.length; y++ ) {
                for (int z = 0; z < nums. length; z++) {
                    nums[x][y][z] = (1*x)*(1*y)*(1*z);
                    System.out.print(nums[x][y][z] + " ");
                }
               System.out.println();
            }
           System.out.println();
        }
//        for (int[][] a : nums) {
//            for (int[] b: a) {
//                for (int c: b) {
//                    sum += c;
//                    System.out.println(sum);
//                }
//            }
//        }
    }
}
