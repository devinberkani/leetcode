import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[] {1,1,2,2}));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        if (nums.length == 1) return result;
        boolean complete = false;
        while (true) {
            int current = 0;
            for (int i = nums.length - 1; i >= 1; i--) {
                if (nums[i - 1] < nums[i]) {
                    current = i - 1;
                    break;
                }
                if (i == 1) complete = true;
            }

            if (complete) break;
            int swap = current + 1;

            for (int i = current + 1; i < nums.length; i++) {
                if (nums[i] > nums[current] && nums[i] <= nums[swap]) swap = i;
            }

            System.out.println("nums is " + Arrays.toString(nums));
            System.out.println("current is " + nums[current]);
            System.out.println("swap is " + nums[swap]);
            System.out.println("swap index is " + swap);

            int placeholder = nums[current];
            nums[current] = nums[swap];
            nums[swap] = placeholder;

            for (int i = 1; i <= (nums.length - current) / 2; i++) {
                placeholder = nums[current + i];
                nums[current + i] = nums[nums.length - i];
                nums[nums.length - i] = placeholder;
            }

            System.out.println("nums after reversal is " + Arrays.toString(nums));
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        }
        return result;
    }
}