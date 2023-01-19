import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})));
        System.out.println(Arrays.deepToString(insert(new int[][]{{1, 5}}, new int[]{6,8})));

    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> merged = new LinkedList<>();
        boolean flag = true;
        for (int i = 0; i < intervals.length; i++) {
            int[] c = intervals[i];
            if (flag && newInterval[0] <= c[0]) {
                c = newInterval;
                flag = false;
                i--;
            }
            if (merged.isEmpty() || c[0] > merged.getLast()[1]) merged.add(c);
            else merged.getLast()[1] = Math.max(merged.getLast()[1], c[1]);
        }
        if (flag) {
            if (merged.isEmpty() || newInterval[0] > merged.getLast()[1]) merged.add(newInterval);
            else merged.getLast()[1] = Math.max(merged.getLast()[1], newInterval[1]);
        }
        return merged.toArray(new int[merged.size()][]);
    }
}