import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(fourSum(new int[] {1000000000,1000000000,1000000000,1000000000}, -294967296));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> r = new ArrayList<>();
        if (nums.length < 4 || target < 0 && nums[0] >= 0 || target > 0 && nums[nums.length - 1] <= 0) return r;
        int i = 0;
        while (i < nums.length - 3) {
            int j = i + 1;
            while (j < nums.length - 2) {
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) r.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                    if (sum <= target) while (nums[k] == nums[++k] && k < l);
                    if (sum >= target) while (nums[l] == nums[--l] && k < l);
                }
                while (nums[j] == nums[++j] && j < k);
            }
            while (nums[i] == nums[++i] && i < nums.length - 2);
        }
        return r;
    }
}