import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
        List<List<Integer>> t = new ArrayList<>();
//        List<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        t.add(a);
//        List<Integer> b = new ArrayList<>();
//        b.add(1);
//        b.add(2);
//        b.add(3);
//        if (!t.contains(b)) t.add(b);
//        System.out.println(t);
    }

    // -4 -1 -1 0 1 2

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 2) {
            if (nums[i] > 0) break;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) r.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if (sum <= 0) while (nums[j] == nums[++j] && j < k);
                if (sum >= 0) while (nums[k] == nums[--k] && j < k);
            }
            while (nums[i] == nums[++i] && i < nums.length - 2);
        }
        return r;
    }
}