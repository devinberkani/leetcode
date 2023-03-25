import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(subsets(new int[] {1,2,3}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs(nums, current, result, 0);
        return result;
    }

    public static void dfs(int[] nums, List<Integer> current, List<List<Integer>> result, int i) {

        if (i >= nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        dfs(nums, current, result, i + 1);

        current.remove(current.size() - 1);
        dfs(nums, current, result, i + 1);

    }
}