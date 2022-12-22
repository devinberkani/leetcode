import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(combinationSum2(new int[] {10,1,2,7,6,1,5}, 8));
//        System.out.println(combinationSum2(new int[] {2,5,2,1,2}, 5));
//        System.out.println(combinationSum2(new int[] {1,1,2,1,1,2}, 4));
//        System.out.println(combinationSum2(new int[] {2,5,2,2}, 4));
    }

    static List<List<Integer>> result = new ArrayList<>();


    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        if (target < candidates[0]) return result;
//        int i = 0;
//        int sum = 0;
//        while (i < candidates.length) {
//            sum += candidates[i];
//            i++;
//        }
//        if (sum < target) return result;
        h(new ArrayList<>(), candidates, 0, target, 0);
        return result;
    }

    public static void h(List<Integer> current, int[] candidates, int start, int target, int ssf) {
        if (ssf > target) return;

        if (ssf == target) {
            result.add(current);
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i - 1]) continue;
            List<Integer> c = new ArrayList<>(current);
            c.add(candidates[i]);
            h(c,candidates,i + 1, target, ssf + candidates[i]);
        }
    }


}