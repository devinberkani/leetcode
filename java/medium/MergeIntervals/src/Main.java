import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
        System.out.println(Arrays.deepToString(merge(new int[][]{{2, 6},{1, 3},{8, 10}, {15, 18}})));

//        LinkedList<int[]> test = new LinkedList<>();
//        int[] x = {1,2,3};
//        int[] y = {1,2,3,4,5};
//        int[] z = {1,2,3,4,5,6,7};
//        test.add(x);
//        test.add(y);
//        test.add(z);
//        System.out.println(Arrays.deepToString(test.toArray(new int[test.size()][])));

//        List<Integer> test = Arrays.asList(5,2,4,3,1);
//
//        int t = test.stream()
//                .filter(a -> a % 2 == 1)
//                .reduce(0, (c,e) -> c + e);
//
//        System.out.println(t);
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] a : intervals) {
            if (merged.isEmpty() || a[0] > merged.getLast()[1]) merged.add(a);
            else merged.getLast()[1] = Math.max(merged.getLast()[1], a[1]);
        }
        return merged.toArray(new int[merged.size()][]);
    }
    //2,2 2,3 3,4 3,4

//    public static int[][] merge(int[][] intervals) {
//        SortedMap<Integer,Integer> m = new TreeMap<>();
//        for (int[] a : intervals) {
//            if (!m.containsKey(a[0])) m.put(a[0], a[1]);
//            else m.put(a[0], Math.max(m.get(a[0]),a[1]));
//        }
//        System.out.println(m);
//        int currStart = 0;
//        int currEnd = 0;
//        int count = 0;
//        SortedMap<Integer,Integer> n = new TreeMap<>();
//        for (Map.Entry<Integer,Integer> c : m.entrySet()) {
//            int thisStart = c.getKey();
//            int thisEnd = c.getValue();
//            if (count == 0) {
//                currStart = thisStart;
//                currEnd = thisEnd;
//                count++;
//                continue;
//            }
//            if (thisStart <= currEnd) currEnd = Math.max(currEnd, thisEnd);
//            else {
//                n.put(currStart,currEnd);
//                currStart = thisStart;
//                currEnd = thisEnd;
//            }
//        }
//        n.put(currStart,currEnd);
//        System.out.println(n);
//        int[][] r = new int[n.size()][2];
//        count = 0;
//        for (Map.Entry<Integer,Integer> c : n.entrySet()) {
//            r[count][0] = c.getKey();
//            r[count][1] = c.getValue();
//            count++;
//        }
//        return r;
//    }
}