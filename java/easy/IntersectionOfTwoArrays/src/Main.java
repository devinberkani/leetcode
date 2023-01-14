import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> r = new ArrayList<>();
        List<Integer> a = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> b = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> min = a.size() <= b.size() ? a : b;
        List<Integer> max = min.equals(a) ? b : a;
        for (Integer integer : min) {
            if (max.contains(integer)) {
                if (!r.contains(integer)) {
                    r.add(integer);
                }
            }
        }
        return r.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}