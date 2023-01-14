import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {};
        int n = 0;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m + n - m >= 0) System.arraycopy(nums2, 0, nums1, m, m + n - m);

        Arrays.sort(nums1);

    }
}