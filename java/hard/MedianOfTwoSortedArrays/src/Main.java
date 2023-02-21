import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> nums = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        Arrays.stream(nums2).forEach(nums::add);
        Collections.sort(nums);
        return nums.size() % 2 == 0 ? (double) (nums.get(nums.size() / 2) + nums.get((nums.size() / 2) - 1)) / 2 : nums.get(nums.size() / 2);
    }
}