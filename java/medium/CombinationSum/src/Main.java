import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(combinationSum(new int[] {2,3,6,7}, 7));
        System.out.println(combinationSum(new int[] {2,3,5}, 8));
//        System.out.println(combinationSum(new int[] {2}, 1));
    }

    static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        h(new ArrayList<>(), candidates, 0, target, 0);
        return result;
    }

    public static void h (ArrayList<Integer> currArr, int[] candidates, int start, int target, int ssf) {

        if (ssf > target) return;

        if (ssf == target) {
            result.add(currArr);
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            ArrayList<Integer> c = new ArrayList<>(currArr);
            c.add(candidates[i]);
            h(c, candidates, i, target, ssf + candidates[i]);
        }
    }
}