import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{5,4,3,2,1})));
    }

    public static String[] findRelativeRanks(int[] score) {
        SortedMap<Integer,Integer> m = new TreeMap<>();
        for (int i = 0; i < score.length; i++) {
            m.put(score[i], i);
        }
        String[] r = new String[score.length];
        int c = r.length;
        for (Map.Entry<Integer, Integer> i : m.entrySet()) {
            switch(c) {
                case 1:
                    r[i.getValue()] = "Gold Medal";
                    break;

                case 2:
                    r[i.getValue()] = "Silver Medal";
                    break;

                case 3:
                    r[i.getValue()] = "Bronze Medal";
                    break;

                default:
                    r[i.getValue()] = String.valueOf(c);
            }
            c--;
        }
        return r;
    }
}