import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}