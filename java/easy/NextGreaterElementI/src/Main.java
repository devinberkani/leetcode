import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> l = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        int i = 0;
        int s = l.indexOf(nums1[i]);
        int n = s;
        while (true) {
            n = n == nums2.length - 1? n : n + 1;
            if (n == nums2.length - 1 || nums2[n] > nums2[s]) {
                nums1[i] = nums2[n] > nums2[s] ? nums2[n] : -1;
                if (i == nums1.length - 1) {
                    break;
                }
                i++;
                s = l.indexOf(nums1[i]);
                n = s;
            }
        }
        return nums1;
    }
}