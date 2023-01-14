import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[] {1,2,3,4,4,4,4,4,5,6,7}));
    }

    public static int thirdMax(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }

        Arrays.sort(nums);
        int r = nums[nums.length - 1];
        int d = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < r) {
                r = nums[i];
                d++;
                if (d == 3) {
                    return r;
                }
            }
        }
        return nums[nums.length - 1];
    }
}