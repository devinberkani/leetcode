import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(combine(5, 4));
    }

    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= n - k + 1; i++) {
            List<Integer> current = new ArrayList<>(i);
            current.add(i);
            getCombinations(result, current, n, k, i);
        }

        return result;
    }

    public static void getCombinations (List<List<Integer>> result, List<Integer> current, int n, int k, int c) {

        if (current.size() >= k) {
            result.add(current);
            return;
        }

        for (int i = c + 1; i <= n; i++) {
            List<Integer> next = new ArrayList<>(current);
            next.add(i);
            getCombinations(result, next, n, k, i);
        }

    }
}