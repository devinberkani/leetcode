import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(permute(new int[] {3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        Arrays.sort(nums);
        r.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        if (nums.length == 1) return r;
        boolean complete = false;

        while (true) {
            List<Integer> c = new ArrayList<>();
            // find first decreasing element
            int start = 0;
            for (int i = nums.length - 1; i >= 1; i--) {
                if (nums[i - 1] < nums[i]) {
                    start = i - 1;
                    break;
                }
                if (i == 1) complete = true;
            }

            if (complete) break;

            // find number just larger than first decreasing element
            int swap = start + 1;
            for (int i = start; i < nums.length; i++) {
                if (nums[i] < nums[swap] && nums[i] > nums[start]) swap = i;
            }

            // swap elements
            int p = nums[start];
            nums[start] = nums[swap];
            nums[swap] = p;

            // reverse everything after the start
            for (int i = 1; i <= (nums.length - start) / 2; i++) {
                p = nums[start + i];
                nums[start + i] = nums[nums.length - i];
                nums[nums.length - i] = p;
            }

            // fill current array and add to result
            for (int num : nums) c.add(num);
            r.add(c);
        }
        return r;
    }
}