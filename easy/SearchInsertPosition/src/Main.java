public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {

        if (target <= nums[0]) {
            return 0;
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        if (target == nums[nums.length - 1]) {
            return nums.length - 1;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= target && nums[i] >= target) {
                return i;
            }
        }
        return 1;
    }
}