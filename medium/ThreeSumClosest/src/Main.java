import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[] {-1,2,1,-4}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int l = nums[0] + nums[1] + nums[2];
        int h = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        if (nums.length <= 3 || target < l) return l;
        if (target > h) return h;
        int r = Integer.MAX_VALUE;
        while (i < nums.length - 2) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int s = nums[i] + nums[j] + nums[k];
                r = Math.abs(s - target) < Math.abs(r - target) ? s : r;
                if (r == target) return r;
                if (s < target) while (nums[j] == nums[++j] && j < k);
                if (s > target) while (nums[k] == nums[--k] && j < k);
            }
            while (nums[i++] == nums[i] && i < nums.length - 2);
        }
        return r;
    }
}