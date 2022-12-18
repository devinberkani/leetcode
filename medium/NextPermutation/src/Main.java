import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test = {2,3,1,3,3};
        System.out.println("Before: " + Arrays.toString(test));
        nextPermutation(test);
        System.out.println("After: " + Arrays.toString(test));
    }

    public static void nextPermutation(int[] nums) {

        // find first decreasing element
        // find number just larger than decreasing element
        // swap with first decreasing element
        // reverse elements from this point to end

        if (nums.length <= 1) return;
        int start = 0;
        int placeholder;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i - 1] < nums[i]) {
                start = i - 1;
                break;
            }
            if (i == 1) {
                Arrays.sort(nums);
                return;
            }
        }

        System.out.println("start is " + start);

        int swap = start + 1;
        for (int j = start + 1; j < nums.length; j++) {
            if (nums[j] > nums[start]) swap = nums[j] - nums[start] <= nums[swap] - nums[start] ? j : swap;
        }

        System.out.println("swap is " + swap);

        placeholder = nums[start];
        nums[start] = nums[swap];
        nums[swap] = placeholder;

        System.out.println(Arrays.toString(nums));

        if (nums.length > 2) {
            for (int i = 1; i <= (nums.length - start) / 2; i++) {
                placeholder = nums[start + i];
                nums[start + i] = nums[nums.length - i];
                nums[nums.length - i] = placeholder;
            }
        }
    }

    // 1,2,3,4,5
    // 1,2,3,5,4
    // 1,2,4,3,5
    // 1,2,4,5,3
    // 1,2,5,3,4
    // 1,2,5,4,3
    // 1,3,2,4,5
    // 1,3,2,5,4
    // 1,3,4,2,5
    // 1,3,4,5,2
    // 1,3,5,2,4
    // 1,3,5,4,2
    // 1,4,2,3,5
    // 1,4,2,5,3
    // 1,4,3,2,5
    // 1,4,3,5,2
    // 1,4,5,2,3
    // 1,4,5,3,2
}