import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            if (i + 2 >= nums.length || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}