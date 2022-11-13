import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {3,1,2};
        int[] nums2 = {1,1};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> r = new ArrayList<>();
        List<Integer> a = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> b = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> min = a.size() <= b.size() ? a : b;
        List<Integer> max = min.equals(a) ? b : a;
        for (Integer integer : min) {
            if (max.contains(integer)) {
                r.add(integer);
                max.remove(integer);
            }
        }
        return r.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}